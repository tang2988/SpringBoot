package com.xxh.springbootMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xxh.springboot.entity.User;

@Mapper
public interface UserMapper {

	public List<User> findUserInfo();

	public int addUserInfo(User user);

	public int delUserInfo(Long userId);
	
	public int updateUser(User user);
	
	public User getUserByUserId(Long userId);

}
