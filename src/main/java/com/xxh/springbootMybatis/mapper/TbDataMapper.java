package com.xxh.springbootMybatis.mapper;

import java.util.List;

import com.xxh.json.RowData;

public interface TbDataMapper {
   

    int insert(RowData record);

    List<RowData>findDataAll();
    
}