package com.ltt.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.ltt.beans.Goods;
import com.ltt.service.GoodsService;
import com.ltt.vo.Condition;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	@RequestMapping("list.do")
	public String getList(Model m,Condition con,@RequestParam(defaultValue = "1")Integer pageNum) {
		PageInfo<Goods> info = service.getListGoods(con,pageNum); 
		m.addAttribute("info", info);
		m.addAttribute("con", "con");
		return "list";
		
	}
}
