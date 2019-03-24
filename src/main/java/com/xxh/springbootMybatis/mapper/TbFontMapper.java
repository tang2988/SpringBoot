package com.xxh.springbootMybatis.mapper;

import java.util.List;

import com.xxh.json.Font;

public interface TbFontMapper {
   

    int insert(Font record);
    
    Font findAll();

   
}