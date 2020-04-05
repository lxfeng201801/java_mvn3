package com.knowyou.cloud.sys.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowyou.cloud.sys.dao.UserMapper;
import com.knowyou.cloud.sys.dao.UserRoleMapper;
import com.knowyou.cloud.sys.model.ParentModule;
import com.knowyou.cloud.sys.model.User;
import com.knowyou.cloud.sys.model.UserExample;
import com.knowyou.cloud.sys.model.UserRole;
import com.knowyou.cloud.sys.model.UserRoleExample;
import com.knowyou.cloud.sys.tool.PageHelp;
import com.knowyou.cloud.sys.tool.Tool;

/**
 * @author 作者 :bill.mei
 * @date 创建时间：2017年5月11日 上午8:55:00
 * @version 1.0
 */
@Transactional
@Service
public class UserService {

	@Autowired
	private UserMapper mapper;

	@Autowired
	private UserRoleMapper userRoleMapper;

	/**
	 * 保存数据
	 * 
	 * @param record
	 *            保存实体
	 * @return 0失败 1成功
	 */
	public int save(User record) {
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
			UserExample uExample = new UserExample();
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
	public User getModelById(int id) {
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
	public String getJsonList(int draw, int start, int len, User record) {
		UserExample uExample = new UserExample();
		uExample.setLimitStart(start);
		uExample.setLimitEnd(len);
		List<User> list = mapper.selectByExample(uExample);
		uExample.clear();
		long count = mapper.countByExample(uExample);
		return PageHelp.ToPageJson(draw, count, list);
	}

	public User login(String name, String pwd) {
		User result = null;
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(name).andPwdEqualTo(Tool.string2MD5(pwd));
		List<User> list = mapper.selectByExample(example);
		if (list != null && !list.isEmpty() && list.size() > 0) {// 登录成功
			result = list.get(0);
		}
		return result;
	}

	public User getAdminByGID(int gid) {
		User result = null;
		UserExample example = new UserExample();
		example.createCriteria().andGidEqualTo(gid).andFlagEqualTo((byte) 1);
		example.setLimitStart(0);
		example.setLimitEnd(1);
		List<User> list = mapper.selectByExample(example);
		if (list != null && list.size() > 0)
			result = list.get(0);
		return result;
	}

	public List<UserRole> getAllRole(int userid, int gid) {
		UserRole record = new UserRole();
		record.setUserId(userid);
		record.setId(gid);
		return userRoleMapper.selectAllRole(record);
	}

	public int saveRole(UserRole record) {
		return userRoleMapper.insert(record);
	}

	public int deleteRole(UserRole record) {
		UserRoleExample example = new UserRoleExample();
		example.createCriteria().andUserIdEqualTo(record.getUserId()).andRoleIdEqualTo(record.getRoleId());
		return userRoleMapper.deleteByExample(example);
	}

	public List<ParentModule> selectUserRoleModule(int userId) {
		return userRoleMapper.selectUserRoleModule(userId);
	}
}
