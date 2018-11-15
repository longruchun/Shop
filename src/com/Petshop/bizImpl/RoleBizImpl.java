package com.Petshop.bizImpl;

import java.util.List;

import com.Petshop.biz.IroleBiz;
import com.Petshop.dao.RoleMapper;
import com.Petshop.model.Role;
import com.Petshop.until.MapperHelper;

public class RoleBizImpl implements IroleBiz {
	RoleMapper dao=new MapperHelper().getMapper(RoleMapper.class);
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Role t) {
		// TODO Auto-generated method stub
		return dao.insert(t);
	}

	@Override
	public int insertSelective(Role t) {
		// TODO Auto-generated method stub
		return dao.insertSelective(t);
	}

	@Override
	public Role selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Role t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(Role t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
}
