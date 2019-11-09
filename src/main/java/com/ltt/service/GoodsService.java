package com.ltt.service;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.ltt.beans.Goods;
import com.ltt.vo.Condition;

public interface GoodsService {

	PageInfo<Goods> getListGoods(Condition con, Integer pageNum);
	void add(List<Goods> goodList);
}
