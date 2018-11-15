package com.Petshop.bizImpl;

import java.util.List;

import com.Petshop.biz.IadminBiz;
import com.Petshop.dao.AdminMapper;
import com.Petshop.dao.ShopmenuMapper;
import com.Petshop.model.Admin;
import com.Petshop.until.MapperHelper;


public class AdminImpl implements IadminBiz {
	AdminMapper dao=new MapperHelper().getMapper(AdminMapper.class);
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Admin t) {
		// TODO Auto-generated method stub
		return dao.insert(t);
	}

	@Override
	public int insertSelective(Admin t) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(t);
	}

	@Override
	public Admin selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Admin t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public int updateByPrimaryKey(Admin t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public List<Admin> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
}
