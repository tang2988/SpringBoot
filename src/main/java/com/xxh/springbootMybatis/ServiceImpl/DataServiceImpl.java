package com.xxh.springbootMybatis.ServiceImpl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xxh.json.FileData;
import com.xxh.json.Font;
import com.xxh.json.RowData;
import com.xxh.springbootMybatis.mapper.TbFontMapper;
import com.xxh.springbootMybatis.mapper.TbDataMapper;

@Service
public class DataServiceImpl {

	@Autowired
	TbDataMapper dataMapper;
	@Autowired
	TbFontMapper tbFontMapper;

	public  void JsonFind() {
		try {

			// 包装流
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/5.json"));
			// 读取文件内容
			byte[] b = new byte[bis.available()];
			bis.read(b);

			String str = new String(b);

			FileData data = JSON.parseObject(str, FileData.class);
			
			 List<RowData> datas = data.getRowlist();
			
			for (int i = 0; i < data.getRowlist().size(); i++) {
				
				dataMapper.insert(data.getRowlist().get(i));
			}
			tbFontMapper.insert(data.getFont());
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
