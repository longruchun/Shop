package com.Petshop.dao;

import com.Petshop.model.Petowner;

public interface PetownerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Petowner record);

    int insertSelective(Petowner record);

    Petowner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Petowner record);

    int updateByPrimaryKey(Petowner record);
}