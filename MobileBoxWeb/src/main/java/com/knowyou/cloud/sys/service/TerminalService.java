package com.knowyou.cloud.sys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.TerminalMapper;
import com.knowyou.cloud.sys.model.mobilebox.Terminal;
import com.knowyou.cloud.sys.model.mobilebox.TerminalExample;
import com.knowyou.cloud.sys.tool.PageHelp;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月8日 上午10:47:11
 * @version 1.0
 */
@Transactional
@Service
public class TerminalService {

	@Autowired
	protected TerminalMapper mapperDao;

	public int update(Terminal record) {
		return mapperDao.updateByPrimaryKey(record);
	}

	public int insert(Terminal record) {
		return mapperDao.insert(record);
	}

	public long countByExample(TerminalExample example) {
		// TODO Auto-generated method stub
		return mapperDao.countByExample(example);
	}

	public int deleteByExample(TerminalExample example) {
		// TODO Auto-generated method stub
		return mapperDao.deleteByExample(example);
	}

	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return mapperDao.deleteByPrimaryKey(id);
	}

	public int insertSelective(Terminal record) {
		// TODO Auto-generated method stub
		return mapperDao.insertSelective(record);
	}

	public List<Terminal> selectByExample(TerminalExample example) {
		// TODO Auto-generated method stub
		return mapperDao.selectByExample(example);
	}

	public Terminal selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return mapperDao.selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(Terminal record, TerminalExample example) {
		// TODO Auto-generated method stub
		return mapperDao.updateByExampleSelective(record, example);
	}

	public int updateByExample(Terminal record, TerminalExample example) {
		// TODO Auto-generated method stub
		return mapperDao.updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(Terminal record) {
		// TODO Auto-generated method stub
		return mapperDao.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Terminal record) {
		// TODO Auto-generated method stub
		return mapperDao.updateByPrimaryKey(record);
	}
	
	/**
	 * 获取数据列表
	 * 
	 * @param start
	 * @param len
	 * @param record
	 * @return
	 */
	public String getJsonList(int draw, int start, int len, Terminal record) {
		TerminalExample uExample = new TerminalExample();
		uExample.setLimitStart(start);
		uExample.setLimitEnd(len);
		List<Terminal> list = mapperDao.selectByExample(uExample);
		uExample.clear();
		long count = mapperDao.countByExample(uExample);
		return PageHelp.ToPageJson(draw, count, list);
	}
}
