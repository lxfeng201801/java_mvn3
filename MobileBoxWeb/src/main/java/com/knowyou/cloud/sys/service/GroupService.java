package com.knowyou.cloud.sys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.GroupMapper;
import com.knowyou.cloud.sys.dao.GroupModuleMapper;
import com.knowyou.cloud.sys.model.Group;
import com.knowyou.cloud.sys.model.GroupExample;
import com.knowyou.cloud.sys.model.GroupModule;
import com.knowyou.cloud.sys.model.GroupModuleExample;
import com.knowyou.cloud.sys.model.Module;
import com.knowyou.cloud.sys.model.ModuleExample;
import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.tool.PageHelp;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月3日 上午10:24:17
 * @version 1.0
 */
@Transactional
@Service
public class GroupService {
	@Autowired
	protected GroupMapper groupDao;

	@Autowired
	protected GroupModuleMapper groupModuleMapper;

	/**
	 * 分页查询数据列表
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public String getList(int draw, int start, int length) {
		GroupExample example = new GroupExample();

		long count = groupDao.countByExample(example);
		example.setLimitStart(start);
		example.setLimitEnd(start + length);
		List<Group> list = groupDao.selectByExample(example);
		return PageHelp.ToPageJson(draw, count, list);
	}

	/**
	 * @param 根据可选条件查询总记录数目
	 * @return 总记录数目
	 */
	public Long getCountByExample(GroupExample example) {
		return groupDao.countByExample(example);
	}

	/**
	 * 根据组id获取组信息
	 * 
	 * @param id
	 * @return
	 */
	public Group getById(int id) {
		return groupDao.selectByPrimaryKey(id);
	}

	/**
	 * 添加组信息
	 */
	public int add(Group group) {
		return groupDao.insertSelective(group);
	}

	/**
	 * 编辑组信息
	 * 
	 * @param group
	 * @return
	 */
	public int edit(Group group) {
		return groupDao.updateByPrimaryKeySelective(group);
	}

	public int delete(String ids) {
		int result = 0;
		GroupExample example = new GroupExample();
		if (ids != null && !ids.isEmpty()) {
			String[] idStr = ids.split(",");
			List<Integer> idList = new ArrayList<>();
			int temp = 0;
			for (String id : idStr) {
				temp = Integer.parseInt(id);
				if (temp > 0) {
					idList.add(temp);
				}
			}
			if (idList.size() > 0) {
				example.createCriteria().andIdIn(idList);
				result = groupDao.deleteByExample(example);
			}
		}
		return result;
	}

	public int saveGroupModule(GroupModule record) {
		int result = 0;
		GroupModuleExample example = new GroupModuleExample();
		example.createCriteria().andGidEqualTo(record.getGid()).andMidEqualTo(record.getMid());
		if (groupModuleMapper.countByExample(example) <= 0)
			result = groupModuleMapper.insert(record);
		return result;
	}

	public int deleteGroupModule(GroupModule record) {
		GroupModuleExample example = new GroupModuleExample();
		example.createCriteria().andGidEqualTo(record.getGid()).andMidEqualTo(record.getMid());
		return groupModuleMapper.deleteByExample(example);
	}

	public List<ParentModule> getAllModuleList(int gid) {
		return groupModuleMapper.selectAllModule(gid);
	}

	public List<ParentModule> getGroupModule(int gid) {
		return groupModuleMapper.selectGroupModule(gid);
	}
}
