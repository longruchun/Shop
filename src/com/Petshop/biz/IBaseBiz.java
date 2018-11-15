package com.Petshop.biz;

import java.util.List;

import com.Petshop.model.Shopmenu;



public interface IBaseBiz<T> {
	int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
    
    
    List<T> getAll();
  
}
