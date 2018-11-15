package com.Petshop.bizImpl;

import java.util.ArrayList;
import java.util.List;

import com.Petshop.biz.IshopMenuBiz;
import com.Petshop.dao.ShopmenuMapper;
import com.Petshop.model.Shopmenu;
import com.Petshop.model.sysmenu;
import com.Petshop.until.MapperHelper;



public class ShopmenuImpl implements IshopMenuBiz {
	ShopmenuMapper dao=new MapperHelper().getMapper(ShopmenuMapper.class);

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Shopmenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Shopmenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shopmenu selectByPrimaryKey(Integer id) {
		Shopmenu sm= dao.selectByPrimaryKey(1);
		System.out.println(sm.getText());
		return sm;
	}

	@Override
	public int updateByPrimaryKeySelective(Shopmenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Shopmenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Shopmenu> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public List<Shopmenu> getModelsByPid(int pid) {
		// TODO Auto-generated method stub
				return dao.getModelsByPid(pid);
	}

	@Override
	public List<sysmenu> getMenus() {
		// TODO Auto-generated method stub
		List<sysmenu> menus=new ArrayList<sysmenu>();
		
		
		List<Shopmenu> items=dao.getModelsByPid(0);
		for(int i=0;i<items.size();i++) {
			menus.add(getMenu(items.get(i).getId()));
		}
		
		
		return menus;
	}

	private sysmenu getMenu(int menuId) {
		//实例化一个以menuId为id 的menu的实例对象
		sysmenu menuNode=new sysmenu();
		
		Shopmenu item=new Shopmenu();
		List<sysmenu> nodes=new ArrayList<sysmenu>();

 	    item=dao.selectByPrimaryKey(menuId);
 	    
 	    menuNode.setId(item.getId());
 	    menuNode.setText(item.getText());
 	    menuNode.setHref(item.getHref());
 
 	   
 	    List<Shopmenu> sub_menuitems=new ArrayList<Shopmenu>(); 
 	    sub_menuitems=dao.getModelsByPid(menuId);//儿子这一层的菜单全部在这里边
 	    for(int i=0;i<sub_menuitems.size();i++) {
 	    	nodes.add(getMenu(sub_menuitems.get(i).getId()));
 	    	
 	    }
 	    menuNode.setNodes(nodes);
 	   
 		return menuNode;
	}
	

}
