package com.Petshop.bizImpl;

import java.util.List;

import com.Petshop.biz.IdeptBiz;
import com.Petshop.dao.AdminMapper;
import com.Petshop.dao.DeptMapper;
import com.Petshop.model.Dept;
import com.Petshop.until.MapperHelper;

public class DeptBizImpl implements IdeptBiz {
	DeptMapper dao=new  MapperHelper().getMapper(DeptMapper.class);
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Dept t) {
		// TODO Auto-generated method stub
		return dao.insert(t);
	}

	@Override
	public int insertSelective(Dept t) {
		// TODO Auto-generated method stub
		return dao.insertSelective(t);
	}

	@Override
	public Dept selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Dept t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(Dept t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public List<Dept> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
	

}
