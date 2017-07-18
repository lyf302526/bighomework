package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.big.domain.Cart;
import org.big.domain.Goods;

/**
 * GoodsMapper接口
 */
public interface GoodsMapper {
	/**
	 * 查询所有物品
	 * @return 物品对象集合
	 */
	@Select("select * from goods")
	List<Goods> findAll();
	

}
