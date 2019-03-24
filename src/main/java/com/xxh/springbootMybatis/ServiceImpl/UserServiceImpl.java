package com.xxh.springbootMybatis.ServiceImpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.xxh.springboot.entity.User;
import com.xxh.springboot.util.DataResult;
import com.xxh.springbootMybatis.mapper.UserMapper;

@Service//@Transactional(rollbackFor=Throwable.class)//定义事务，只有发生类型为Throwable的异常都回滚。Throwable是所有异常的父类，这里表示任何异常都回滚。spring事务是aop提供的 ，所以会自动打开aop代理模式
public class UserServiceImpl   {

	@Resource
	UserMapper userMapper;
	
	
	public DataResult findUserInfo() {
		DataResult dataResult = new DataResult();
		//查询所有用户信息
		 List<User> list = userMapper.findUserInfo();
		 if(list!=null && list.size()>0){
			 dataResult.setData(list);
			 dataResult.setMsg("查询成功");
			 dataResult.setStatus(200);
			 return dataResult;
		 }
		return null;
	}


	public DataResult addUserInfo(User user) {
		DataResult dataResult = new DataResult();
		if(user.getUserName()==null){
			 dataResult.setMsg("用户名不能为空");
			 return dataResult;
		}
		if(user.getPassword()==null){
			 dataResult.setMsg("密码不能为空");
			 return dataResult;
		}
		if(user.getUserPhone()==null){
			 dataResult.setMsg("手机号码不能为空");
		}
		user.setRegisterTime(new Date());
		user.setCreateTime(new Date());
		user.setRemarks("添加用户");
		user.setUserStatus(10);
		user.setVersionNO(1);
		
		 int count = userMapper.addUserInfo(user);
		 if(count>0){
			  User Resultuser = userMapper.getUserByUserId(user.getUserId());
			 dataResult.setData(Resultuser);
			 dataResult.setMsg("添加成功");
			 dataResult.setStatus(200);
			 return dataResult;
		 }
		 dataResult.setMsg("添加失败");
		 dataResult.setStatus(500);
		return dataResult;
	}

	public DataResult delUserInfo(Long userId) {
		DataResult dataResult  =new DataResult();
		int count = userMapper.delUserInfo(userId);
		if(count>0){
			dataResult.setMsg("删除成功");
			dataResult.setStatus(200);
			return dataResult;
		}
		return null;
	}

	public DataResult updateUser(User user) {
		DataResult dataResult = new DataResult();
		if(user.getUserName()==null){
			 dataResult.setMsg("用户名不能为空");
			 return dataResult;
		}
		if(user.getPassword()==null){
			 dataResult.setMsg("密码不能为空");
			 return dataResult;
		}
		if(user.getUserPhone()==null){
			 dataResult.setMsg("手机号码不能为空");
			 return dataResult;
		}
		 int updateuser = userMapper.updateUser(user);
		 if(updateuser<0){
			 dataResult.setMsg("修改失败");
			 dataResult.setStatus(500);
			 return dataResult;
		 }
		 dataResult.setMsg("修改成功");
		 dataResult.setStatus(200);
		 return dataResult;
		
	}
	
	public DataResult findByUserId(Long userId){
		DataResult dataResult  =new DataResult();
		 User user = userMapper.getUserByUserId(userId);
		 if(user==null){
			 dataResult.setMsg("查询出错");
			 dataResult.setStatus(500);
		 }
		 dataResult.setData(user);
		 dataResult.setMsg("查询成功");
		 dataResult.setStatus(200);
		return dataResult;
	}

	

}
