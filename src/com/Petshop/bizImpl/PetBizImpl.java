package com.Petshop.bizImpl;

import java.util.List;

import com.Petshop.biz.IpetBiz;
import com.Petshop.dao.PetMapper;
import com.Petshop.model.Pet;
import com.Petshop.until.MapperHelper;

public class PetBizImpl implements IpetBiz {
	PetMapper dao=new MapperHelper().getMapper(PetMapper.class);
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Pet t) {
		// TODO Auto-generated method stub
		return dao.insert(t);
	}

	@Override
	public int insertSelective(Pet t) {
		// TODO Auto-generated method stub
		return dao.insertSelective(t);
	}

	@Override
	public Pet selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Pet t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKeySelective(t);
	}

	@Override
	public int updateByPrimaryKey(Pet t) {
		// TODO Auto-generated method stub
		return dao.updateByPrimaryKey(t);
	}

	@Override
	public List<Pet> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	

}
