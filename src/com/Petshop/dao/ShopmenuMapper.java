package com.Petshop.dao;

import java.util.List;

import com.Petshop.model.Shopmenu;
import com.Petshop.model.ShopmenuKey;


public interface ShopmenuMapper {
    int deleteByPrimaryKey(ShopmenuKey key);

    int insert(Shopmenu record);

    int insertSelective(Shopmenu record);

    Shopmenu selectByPrimaryKey(int i);

    int updateByPrimaryKeySelective(Shopmenu record);

    int updateByPrimaryKey(Shopmenu record);
  List<Shopmenu> getAll();
    
    List<Shopmenu> getModelsByPid(int pid);
    
    
    
    
    
}