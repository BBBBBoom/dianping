package com.vzark.dianping.service.impl;

import com.vzark.dianping.dao.UserModelMapper;
import com.vzark.dianping.model.UserModel;
import com.vzark.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 用户实现类
 * @Author pzx
 * @Date 2020/5/26
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserModelMapper userModelMapper;

	@Override
	public UserModel getUserById(Integer id) {
		return userModelMapper.selectByPrimaryKey(id);
	}
}
