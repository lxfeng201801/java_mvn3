package com.knowyou.cloud.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.ModuleMapper;
import com.knowyou.cloud.sys.model.Module;
import com.knowyou.cloud.sys.model.ModuleExample;
import com.knowyou.cloud.sys.tool.PageHelp;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月2日 上午10:03:13
 * @version 1.0
 */
@Transactional
@Service
public class ModuleService {
	@Autowired
	protected ModuleMapper moduleDao;

	public int save(Module model) {
		int rt = 0;
		if (model.getId() != null && model.getId() > 0) {
			rt = moduleDao.updateByPrimaryKey(model);
		} else {
			rt = moduleDao.insertSelective(model);
		}
		return rt;
	}

	public Module getById(int id) {
		return moduleDao.selectByPrimaryKey(id);
	}

	public List<Module> getPreNode(int pid) {
		ModuleExample example = new ModuleExample();
		example.createCriteria().andPidEqualTo(pid);
		return moduleDao.selectByExample(example);
	}

	public String getList(int draw, int start, int end) {
		ModuleExample example = new ModuleExample();
		long count = moduleDao.countByExample(example);
		example.setLimitStart(start);
		example.setLimitEnd(start + end);
		List<Module> list = moduleDao.selectByExample(example);
		return PageHelp.ToPageJson(draw, count, list);
	}

	public int delete(String ids) {
		List<Integer> valus = new ArrayList<Integer>();
		String[] idList = ids.split(",");
		int temp = 0;
		for (int i = 0; i < idList.length; i++) {
			if (idList[i] != null && !idList[i].isEmpty()) {
				temp = Integer.parseInt(idList[i]);
				if (temp > 0) {
					valus.add(temp);
				}
			}
		}
		ModuleExample example = new ModuleExample();
		example.createCriteria().andIdIn(valus);
		return moduleDao.deleteByExample(example);
	}
}