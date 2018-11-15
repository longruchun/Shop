package com.Petshop.biz;

import java.util.List;

import com.Petshop.model.Shopmenu;
import com.Petshop.model.sysmenu;


public interface IshopMenuBiz extends IBaseBiz<Shopmenu> {
	List<Shopmenu> getModelsByPid(int pid);
	List<sysmenu> getMenus();
	  
}
