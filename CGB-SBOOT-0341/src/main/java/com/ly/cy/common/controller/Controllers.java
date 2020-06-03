package com.ly.cy.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ly.cy.common.pojo.Activity;
import com.ly.cy.common.service.serviceActive;

@Controller
@RequestMapping("/goods/")
public class Controllers {
@Autowired
private serviceActive serviceactive;
 
  @RequestMapping("selectactivity")
   public String selectactivy(Model moder)
   {
	   List<Activity> slactive = serviceactive.selectactivity();
	   moder.addAttribute("list", slactive);
	   for (Activity activity : slactive) {
		System.out.println(activity);
	}
	   
	   return "goods";
   }
  @RequestMapping("deleteById")
  public String deletebyid(Integer id)
  {
	  serviceactive.deletebyid(id);
	 
	  return "redirect:selectactivity";
  }



}
