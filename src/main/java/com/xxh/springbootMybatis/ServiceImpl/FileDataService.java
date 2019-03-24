package com.xxh.springbootMybatis.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.xxh.json.FileData;
import com.xxh.json.Font;
import com.xxh.json.RowData;
import com.xxh.springbootMybatis.mapper.TbDataMapper;
import com.xxh.springbootMybatis.mapper.TbFontMapper;

@Service
public class FileDataService {

	@Autowired
	TbFontMapper fontMapper;
	TbDataMapper dataMapper;
	
	public FileData findJson(){
		
		FileData data = new FileData();
		 Font font = fontMapper.findAll();
		 if(font!=null){
			 data.setFont(font);
		 }
		 List<RowData> list = dataMapper.findDataAll();
		 if(list!=null && list.size()>0){
			 data.setRowlist(list);
		 }
		 JSON.toJSONString(data);
		 return data;
	}
	
}
