package com.knowyou.cloud.sys.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.DomainMapper;
import com.knowyou.cloud.sys.model.Domain;
import com.knowyou.cloud.sys.model.DomainExample;
import com.knowyou.cloud.sys.tool.PageHelp;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 下午1:50:42
 * @version 1.0
 */
@Transactional
@Service
public class DomainService {

	@Autowired
	private DomainMapper mapper;

	public int save(Domain record) {
		int result = 0;
		if (record != null) {
			if (record.getId() != null && record.getId() > 0) {
				result = mapper.updateByPrimaryKeySelective(record);
			} else {
				record.setCreateTime(new Date());
				result = mapper.insert(record);
			}
		}
		return result;
	}

	/**
	 * 删除
	 * 
	 * @param values
	 *            ID集合
	 * @return 0失败 1成功
	 */
	public int delete(String ids) {
		int result = 0;
		if (ids != null && !ids.isEmpty()) {
			List<Integer> values = new ArrayList<Integer>();
			String[] strs = ids.split(",");
			int temp = 0;
			for (String id : strs) {
				temp = Integer.parseInt(id);
				if (!id.isEmpty() && temp > 0) {
					values.add(temp);
				}
			}
			DomainExample uExample = new DomainExample();
			uExample.createCriteria().andIdIn(values);
			result = mapper.deleteByExample(uExample);
		}
		return result;
	}

	/**
	 * 根据id获取用户
	 * 
	 * @param id
	 * @return
	 */
	public Domain getModelById(int id) {
		return mapper.selectByPrimaryKey(id);
	}

	/**
	 * 获取数据列表
	 * 
	 * @param start
	 * @param len
	 * @param record
	 * @return
	 */
	public String getJsonList(int draw, int start, int len, Domain record) {
		DomainExample uExample = new DomainExample();
		uExample.setLimitStart(start);
		uExample.setLimitEnd(len);
		List<Domain> list = mapper.selectByExample(uExample);
		uExample.clear();
		long count = mapper.countByExample(uExample);
		return PageHelp.ToPageJson(draw, count, list);
	}
}
