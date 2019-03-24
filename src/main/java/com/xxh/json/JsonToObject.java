package com.xxh.json;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.alibaba.fastjson.JSON;

public class JsonToObject {

	public static void main(String[] args) {
			
		try {
			
			//包装流
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/5.json"));
			//读取文件内容
			byte[] b = new byte[bis.available()];
			bis.read(b);
			
			String str = new String(b);
			
			
			   FileData data = JSON.parseObject(str,FileData.class);
			   
			 
			 
			
		
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	 
		
}
