package com.xxh.Controller;

import javax.annotation.Resource;

import org.jooq.util.jaxb.tools.StringAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxh.springboot.entity.User;
import com.xxh.springboot.util.DataResult;
import com.xxh.springbootMybatis.ServiceImpl.UserServiceImpl;
import com.xxh.springbootMybatis.mapper.UserMapper;




@Controller
public class UserController {
	@Autowired
	UserServiceImpl userservice;// userservice如果有interface，这里应该是定义为interface，不过现在流行service不要接口，上来就是实现类
	@Resource
	UserMapper mapper;
	/**
	 * 首页数据
	 *谢雄辉
	 *version 1.8
	 *2019年3月10日
	 *@param model
	 */
	@RequestMapping(value="/")
	public String indexshouye(Model model){
		DataResult dataResult = userservice.findUserInfo();
		model.addAttribute("user", dataResult.getData());
		return "index";
	}
	
	/**
	 * 展示修改页面
	 *谢雄辉
	 *version 1.8
	 *2019年3月10日
	 *@return
	 */
	@RequestMapping(value="/update.html")
	public String updateHtml(Long userId,Model model){
		 DataResult dataResult = userservice.findByUserId(userId);
		 model.addAttribute("user", dataResult.getData());
		return "update";
	}
	/**
	 * 处理 修改信息
	 *谢雄辉
	 *version 1.8
	 *2019年3月10日
	 *@return
	 */
	@RequestMapping("/update.do")
	@ResponseBody
	public DataResult updatedo(@RequestParam("userId") Long userId,@RequestParam("userName")String userName,@RequestParam("password")String password,@RequestParam("userPhone") String userPhone,@RequestParam("userStatus")Integer userStatus){
		User user = new User();
		user.setPassword(password);
		user.setUserPhone(userPhone);
		user.setUserName(userName);
		user.setUserStatus(userStatus);
		user.setUserId(userId);
		  DataResult dataResult = userservice.updateUser(user);
		return dataResult;
	}
	/**
	 * 展示添加用戶頁面
	 *谢雄辉
	 *version 1.8
	 *2019年3月10日
	 *@return
	 */
	@RequestMapping(value="/insert.html")
	public String insertHtml(){
		
		return "insert";
	}
	@RequestMapping(value="/insert.do")
	@ResponseBody
	public DataResult insertdo(@RequestParam("userName")String userName ,@RequestParam("password")String password, @RequestParam("userPhone")String userPhone){
		User user = new User();
		user.setPassword(password);
		user.setUserName(userName);
		user.setUserPhone(userPhone);
		DataResult dataResult= userservice.addUserInfo(user);
		return dataResult;
	}
	
	
	/**
	 * 刪除用戶
	 *谢雄辉
	 *version 1.8
	 *2019年3月10日
	 *@param userId
	 *@return
	 */
	@RequestMapping(value="/delete.do")
	@ResponseBody
	public DataResult deltedo(Long userId){
		 DataResult dataResult = userservice.delUserInfo(userId);
		return dataResult;
	}
	
	
	
	
	

}
