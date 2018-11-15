package com.Petshop.Servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Petshop.biz.IshopMenuBiz;
import com.Petshop.bizImpl.ShopmenuImpl;
import com.Petshop.model.sysmenu;
import com.fasterxml.jackson.databind.ObjectMapper;



@WebServlet("/resourceServlet")
public class resourceServlet extends BaseServlet {
   public String getMenu(HttpServletRequest request,HttpServletResponse response) throws Exception {
	          
	   IshopMenuBiz biz=new ShopmenuImpl();
   	
   	List<sysmenu> list=biz.getMenus();
   	
   	ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(list);
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json;charset=utf-8");
		
		response.getWriter().print(json);
   	
   	
   	return "ajax"; 
   	
   	
  
	   
	   
		
   }
   
  
 
}