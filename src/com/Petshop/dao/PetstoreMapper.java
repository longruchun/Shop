package com.Petshop.dao;

import com.Petshop.model.Petstore;

public interface PetstoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Petstore record);

    int insertSelective(Petstore record);

    Petstore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Petstore record);

    int updateByPrimaryKey(Petstore record);
}