package com.Petshop.bizImpl;

import java.util.List;

import com.Petshop.biz.IpetownerBiz;
import com.Petshop.dao.PetownerMapper;
import com.Petshop.model.Petowner;
import com.Petshop.until.MapperHelper;


public class petownerBizimpl implements IpetownerBiz {
	PetownerMapper dao=new MapperHelper().getMapper(PetownerMapper.class);
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Petowner t) {
		// TODO Auto-generated method stub
		return dao.insert(t);
	}

	@Override
	public int insertSelective(Petowner t) {
		// TODO Auto-generated method stub
		return dao.insertSelective(t);
	}

	@Override
	public Petowner selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Petowner t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(Petowner t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public List<Petowner> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
	

}
