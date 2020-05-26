package com.vzark.dianping.service;


import com.vzark.dianping.model.UserModel;

/**
 * @Description 用户类
 * @author pzx
 * @Date 2020/5/26
 */
public interface UserService {

	/**
	 * 获取一个user
	 * @param id
	 * @return
	 */
	UserModel getUserById(Integer id);
}
