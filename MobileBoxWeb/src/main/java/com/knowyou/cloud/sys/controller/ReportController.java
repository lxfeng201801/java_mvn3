package com.knowyou.cloud.sys.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.knowyou.cloud.sys.model.mobilebox.RankingInput;
import com.knowyou.cloud.sys.model.mobilebox.RankingInputExample;
import com.knowyou.cloud.sys.model.mobilebox.RankingMovieExample;
import com.knowyou.cloud.sys.model.mobilebox.RankingSearch;
import com.knowyou.cloud.sys.model.mobilebox.RankingSearchExample;
import com.knowyou.cloud.sys.model.mobilebox.RankingTvExample;
import com.knowyou.cloud.sys.model.mobilebox.RankingVarietyShowExample;
import com.knowyou.cloud.sys.model.mobilebox.UserInput;
import com.knowyou.cloud.sys.model.mobilebox.UserInputExample;
import com.knowyou.cloud.sys.model.mobilebox.UserOnline;
import com.knowyou.cloud.sys.model.mobilebox.UserOnlineExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoApply;
import com.knowyou.cloud.sys.model.mobilebox.VideoApplyExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoDelay;
import com.knowyou.cloud.sys.model.mobilebox.VideoDelayExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoKa;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaReson;
import com.knowyou.cloud.sys.model.mobilebox.VideoKaResonExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoQuality;
import com.knowyou.cloud.sys.model.mobilebox.VideoQualityExample;
import com.knowyou.cloud.sys.model.mobilebox.VideoType;
import com.knowyou.cloud.sys.model.mobilebox.VideoTypeExample;
import com.knowyou.cloud.sys.service.RankingInputService;
import com.knowyou.cloud.sys.service.RankingMovieService;
import com.knowyou.cloud.sys.service.RankingSearchService;
import com.knowyou.cloud.sys.service.RankingTvService;
import com.knowyou.cloud.sys.service.RankingVarietyShowService;
import com.knowyou.cloud.sys.service.TerminalService;
import com.knowyou.cloud.sys.service.UserInputService;
import com.knowyou.cloud.sys.service.UserOnlineService;
import com.knowyou.cloud.sys.service.VideoApplyService;
import com.knowyou.cloud.sys.service.VideoDelayService;
import com.knowyou.cloud.sys.service.VideoKaResonService;
import com.knowyou.cloud.sys.service.VideoKaService;
import com.knowyou.cloud.sys.service.VideoQualityService;
import com.knowyou.cloud.sys.service.VideoTypeService;
import com.knowyou.cloud.sys.tool.DataSourceContextHolder;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月2日 上午10:03:13
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/report")
public class ReportController {

	@Autowired
	protected UserOnlineService userOnlineService;

	@Autowired
	protected VideoTypeService videoTypeService;

	@Autowired
	protected UserInputService userInputService;

	@Autowired
	protected VideoQualityService videoQualityService;

	@Autowired
	protected TerminalService terminalService;

	@Autowired
	protected VideoKaService videoKaService;

	@Autowired
	protected VideoDelayService videoDelayService;
	
	@Autowired
	protected VideoKaResonService videoKaResonService;
	
	@Autowired
	protected RankingInputService rankingInputService;
	
	@Autowired
	protected VideoApplyService videoApplyService;
	
	@Autowired
	protected RankingSearchService rankingSearchService;
	
	@Autowired
	protected RankingTvService rankingTvService;
	
	@Autowired
	protected RankingMovieService rankingMovieService;
	
	@Autowired
	protected RankingVarietyShowService rankingVarietyShowService;


	@RequestMapping(value = { "/", "base" })
	public String base() {
		return "report/base";
	}

	@RequestMapping(value = "analysis")
	public String analysis() {
		return "report/analysis";
	}

	@RequestMapping(value = "ranking")
	public String ranking() {
		return "report/ranking";
	}

	@RequestMapping(value = "userOnline")
	public String module()
	{
		return "report/userOnline";
	}

	/************************************************基础汇总*************************************************************/
	
	@ResponseBody()
	@RequestMapping(value = "base_userOnline_data")
	/**
	 * 获取在线用户各个时段的数量列表
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getUserOnline(Integer provinceId, Integer cityId, Integer type, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		UserOnlineExample example = new UserOnlineExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		List<UserOnline> userOnlineList = userOnlineService.getUserOnlineListByType(example, type);
		Gson gson = new Gson();

		return gson.toJson(userOnlineList);
	}

	@ResponseBody()
	@RequestMapping(value = "base_videoType_data")
	/**
	 * 获取功能分布数据列表
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getVideoType(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoTypeExample example = new VideoTypeExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		VideoType videoType = videoTypeService.getVideoType(example);
		Gson gson = new Gson();

		return gson.toJson(videoType);
	}
	
	@ResponseBody()
	@RequestMapping(value = "base_videoQuality_data")
	/**
	 * 获取视频质量(码流占比)
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getVideoQuality(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoQualityExample example = new VideoQualityExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		VideoQuality videoQuality = videoQualityService.getVideoQuality(example);
		Gson gson = new Gson();

		return gson.toJson(videoQuality);
	}
	
	@ResponseBody()
	@RequestMapping(value = "base_userInput_data")
	/**
	 * 获取接入方式(无线网、有线网个数)
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getUserInput(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		UserInputExample example = new UserInputExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		UserInput userInput = userInputService.getUserOnline(example);
		Gson gson = new Gson();

		return gson.toJson(userInput);
	}
	
	@ResponseBody()
	@RequestMapping(value = "base_rankingTv_data", produces = "text/html;charset=UTF-8")
	/**
	 * 获取电视剧排行列表
	 * @param provinceId
	 * @param cityId
	 * @param startTime
	 * @param endTime
	 * @param draw
	 * @param start
	 * @param len
	 * @return
	 */
	public String getRankingTvList(Integer provinceId, Integer cityId, Date startTime, Date endTime, int draw, int start, int length)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		RankingTvExample example = new RankingTvExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		
		return rankingTvService.getRankingTvList(example, draw, start, length);
	}
	
	@ResponseBody()
	@RequestMapping(value = "base_rankingMovie_data", produces = "text/html;charset=UTF-8")
	/**
	 * 获取电影排行列表
	 * @param provinceId
	 * @param cityId
	 * @param startTime
	 * @param endTime
	 * @param draw
	 * @param start
	 * @param len
	 * @return
	 */
	public String getRankingMovieList(Integer provinceId, Integer cityId, Date startTime, Date endTime, int draw, int start, int length)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		RankingMovieExample example = new RankingMovieExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		
		return rankingMovieService.getRankingMovieList(example, draw, start, length);
	}
	
	@ResponseBody()
	@RequestMapping(value = "base_rankingVarietyShow_data", produces = "text/html;charset=UTF-8")
	/**
	 * 获取综艺排行列表
	 * @param provinceId
	 * @param cityId
	 * @param startTime
	 * @param endTime
	 * @param draw
	 * @param start
	 * @param len
	 * @return
	 */
	public String getRankingVarietyShowList(Integer provinceId, Integer cityId, Date startTime, Date endTime, int draw, int start, int length)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		RankingVarietyShowExample example = new RankingVarietyShowExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		
		return rankingVarietyShowService.getRankingVarietyShowDaoList(example, draw, start, length);
	}
	
	
	/************************************************首页*************************************************************/
	
	@ResponseBody()
	@RequestMapping(value = "home_terminal_count")
	/**
	 * 总用户数
	 */
	public long getCount()
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		long count = terminalService.countByExample(null);

		return count;
	}

	@ResponseBody()
	@RequestMapping(value = "home_userOnline_count")
	/**
	 * 在线用户个数
	 */
	public long getUserOnlineCount()
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		long count = userOnlineService.getOnlineUserCount();

		return count;
	}

	@ResponseBody()
	@RequestMapping(value = "home_videoKa_top10")
	/**
	 * 获取卡顿时延top10
	 */
	public String getVideoKaTop10List()
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");

		VideoKaExample example = new VideoKaExample();
		example.setLimitStart(0);
		example.setLimitEnd(10);
		List<VideoKa> videoKaList = videoKaService.getVideoKaList(example);

		Gson gson = new Gson();

		return gson.toJson(videoKaList);
	}
	
	/************************************************质量分析*************************************************************/
	
	@ResponseBody()
	@RequestMapping(value = "analysis_videoType_data")
	/**
	 * 获取用户分值
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getVideoType(Integer provinceId, Integer cityId, Integer type, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoTypeExample example = new VideoTypeExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		List<VideoType> videoTypeList = videoTypeService.getVideoTypeListByType(example, type);
		Gson gson = new Gson();

		return gson.toJson(videoTypeList);
	}

	@ResponseBody()
	@RequestMapping(value = "analysis_videoDelay_data")
	/**
	 * 获取播放时延统计
	 * @param provinceId
	 * @param cityId
	 * @param type
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public String getVideoDelay(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoDelayExample example = new VideoDelayExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		VideoDelay videoDelay = videoDelayService.getVideoDelay(example);
		Gson gson = new Gson();

		return gson.toJson(videoDelay);
	}

	@ResponseBody()
	@RequestMapping(value = "analysis_videoKa_data")
	/**
	 * 获取卡顿次数
	 */
	public String getVideoKaList(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");

		VideoKaExample example = new VideoKaExample();
		
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		
		VideoKa videoKa = videoKaService.getVideoKa(example);

		Gson gson = new Gson();

		return gson.toJson(videoKa);
	}

	@ResponseBody()
	@RequestMapping(value = "analysis_videoKaReson_data")
	/**
	 * 获取卡顿原因
	 */
	public String getVideoKaResonList(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");

		VideoKaResonExample example = new VideoKaResonExample();
		
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		
		List<VideoKaReson> videoKaResonList = videoKaResonService.getVideoKaResonList(example);

		Gson gson = new Gson();

		return gson.toJson(videoKaResonList);
	}

	/************************************************分类排名*************************************************************/
	
	@ResponseBody()
	@RequestMapping(value = "ranking_input_data")
	/**
	 * 获取入口排名列表
	 */
	public String getRankingInputList(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		RankingInputExample example = new RankingInputExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		List<RankingInput> rankingInputList = rankingInputService.getRankingInputListByTile(example);
		
		Gson gson = new Gson();
		
		return gson.toJson(rankingInputList); 
	}
	
	@ResponseBody()
	@RequestMapping(value = "ranking_videoApply_data")
	/**
	 * 获取咪咕应用排名
	 */
	public String getVideoApplyList(Integer provinceId, Integer cityId, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoApplyExample example = new VideoApplyExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		List<VideoApply> videoApplyList = videoApplyService.getVideoApplyListGroupName(example);
		
		Gson gson = new Gson();
		
		return gson.toJson(videoApplyList);
	}
	
	@ResponseBody()
	@RequestMapping(value = "ranking_videoApplyType_data")
	/**
	 * 根据type分组统计各个时间段的值
	 */
	public String getVideoApplyListByType(Integer provinceId, Integer cityId, Integer type, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		VideoApplyExample example = new VideoApplyExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		List<VideoApply> videoApplyList = videoApplyService.getVideoApplyListByType(example, type);
		
		Gson gson = new Gson();
		
		return gson.toJson(videoApplyList);
	}
	
	@ResponseBody()
	@RequestMapping(value = "ranking_searchTop10_data", produces = "text/html;charset=UTF-8")
	/**
	 * 查询搜索热词排名top10
	 */
	public String getRankingSearchListTop10(Integer provinceId, Integer cityId, Integer type, Date startTime, Date endTime)
	{
		DataSourceContextHolder.setDbType("ky_mobile_box");
		RankingSearchExample example = new RankingSearchExample();
		example.createCriteria().andProvinceIdEqualTo(provinceId).andCityIdEqualTo(cityId).andDateBetween(startTime, endTime);
		example.setOrderByClause("val DESC");
		example.setLimitStart(0);
		example.setLimitEnd(10);
		List<RankingSearch> rankingSearchList = rankingSearchService.getRankingSearchListByTitle(example);
		
		Gson gson = new Gson();
		
		return gson.toJson(rankingSearchList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	











}