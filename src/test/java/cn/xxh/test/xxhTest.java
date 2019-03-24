package cn.xxh.test;

import javax.annotation.Resource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.xxh.springbootMybatis.ServiceImpl.DataServiceImpl;

@SpringBootApplication/*(exclude = DataSourceAutoConfiguration.class)*/
@ComponentScan(value={"com.xxh.springbootMybatis.ServiceImpl","com.xxh.Controller"})
@MapperScan(value="com.xxh.springbootMybatis.mapper")
public class xxhTest {
	
	@Autowired
	DataServiceImpl impl;
	
	public static void main(String[] args) {
		
		
	}

}
