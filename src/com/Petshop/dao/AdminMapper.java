package com.Petshop.dao;

import java.util.List;

import com.Petshop.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    int selectByPrimaryKey(Admin t);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

	Admin selectByPrimaryKey(Integer id);

	List<Admin> getAll();
}