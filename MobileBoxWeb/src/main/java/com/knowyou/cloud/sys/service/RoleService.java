package com.knowyou.cloud.sys.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.RoleMapper;
import com.knowyou.cloud.sys.dao.RoleModuleMapper;
import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.Role;
import com.knowyou.cloud.sys.model.RoleExample;
import com.knowyou.cloud.sys.model.RoleModule;
import com.knowyou.cloud.sys.model.RoleModuleExample;
import com.knowyou.cloud.sys.tool.PageHelp;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 上午11:40:04
 * @version 1.0
 */
@Transactional
@Service
public class RoleService {

	@Autowired
	private RoleMapper mapper;

	@Autowired
	private RoleModuleMapper roleModuleMapper;

	public int save(Role record) {
		int result = 0;
		if (record != null) {
			if (record.getId() != null && record.getId() > 0) {
				result = mapper.updateByPrimaryKeySelective(record);
			} else {
				record.setCreateTime(new Date());
				record.setGid(1);
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
			RoleExample uExample = new RoleExample();
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
	public Role getModelById(int id) {
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
	public String getJsonList(int draw, int start, int len, Role record) {
		RoleExample example = new RoleExample();
		example.createCriteria().andGidEqualTo(record.getGid());
		long count = mapper.countByExample(example);

		example.setLimitStart(start);
		example.setLimitEnd(len);
		List<Role> list = mapper.selectByExample(example);
		return PageHelp.ToPageJson(draw, count, list);
	}

	public int saveModule(RoleModule record) {
		int result = 0;
		RoleModuleExample example = new RoleModuleExample();
		example.createCriteria().andMidEqualTo(record.getMid()).andRidEqualTo(record.getRid());
		if (roleModuleMapper.countByExample(example) <= 0)
			result = roleModuleMapper.insert(record);
		return result;
	}

	public int deleteModule(RoleModule record) {
		RoleModuleExample example = new RoleModuleExample();
		example.createCriteria().andMidEqualTo(record.getMid()).andRidEqualTo(record.getRid());
		return roleModuleMapper.deleteByExample(example);
	}

	public List<ParentModule> getAllModuleList(int gid, int rid) {
		RoleModule record = new RoleModule();
		record.setId(gid);
		record.setRid(rid);
		return roleModuleMapper.selectAllModule(record);
	}

	public List<ParentModule> getGroupModule(int gid, int rid) {
		RoleModule record = new RoleModule();
		record.setId(gid);
		record.setRid(rid);
		return roleModuleMapper.selectRoleModule(record);
	}

	public List<Role> getGroupRole(int gid) {
		RoleExample example = new RoleExample();
		example.createCriteria().andGidEqualTo(gid);
		return mapper.selectByExample(example);
	}
}
