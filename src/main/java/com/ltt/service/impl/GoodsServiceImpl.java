package com.ltt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ltt.beans.Goods;
import com.ltt.mapper.GoodsMapper;
import com.ltt.service.GoodsService;
import com.ltt.vo.Condition;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper mapper;

	@Override
	public PageInfo getListGoods(Condition con, Integer pageNum) {
		PageHelper.startPage(pageNum, 5);
		List list = mapper.getListGoods(con);
		PageInfo info = new PageInfo(list);
		return info;
	}

	@Override
	public void add(List<Goods> goodList) {
		for (Goods goods : goodList) {
			mapper.add(goods);
		}
	}

	
}
