package com.ltt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ltt.beans.Goods;
import com.ltt.vo.Condition;

public interface GoodsMapper {

	List getListGoods(@Param("con")Condition con);

	void add(Goods goods);

	

	

}
