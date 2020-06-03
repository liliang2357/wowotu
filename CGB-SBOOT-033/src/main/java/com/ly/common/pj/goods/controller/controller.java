package com.ly.common.pj.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ly.common.pojo.door;
import com.ly.common.service.GoodsService;

@Controller
@RequestMapping("/goods/")
public class controller {
	@Autowired
	private GoodsService goods;
	@RequestMapping("doGoodsUI")
	public String doGoodsUI(Model model)
	{
		List<door> list = goods.selectbyid();
		model.addAttribute("list", list);
		return "goods";//会将view传递给视图解析器
		//viewResolver会将view的名字进行解析（例如添加前缀和后缀）
		//viewResolver会将结果返回给DispatcherServlet
		//把商品信息带到html上
	}
	@RequestMapping("deleteById")
	public String deleteById(Integer id)
	{
		System.out.println(id);
		goods.deletebyid1(id);
		
		return "redirect:doGoodsUI";
	}
	@RequestMapping("insertbyid")
	public String insertbyid(door door)
	{
		System.out.println(door.toString());
		goods.insertbyid(door);
		
		return "redirect:doGoodsUI";
	}
}
