package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.Order;

public interface OrderMapper {
	@Select(" select * from order ")
	List<Order> findAll();
	@Delete("delete from order where id=#{id}")
	int delete(Order order);
	@Select(" select * from order where user_id=#{user.id}")
	List<Order> findSome();
	@Insert("insert into order(goods_id,user_id,state)values(#{goods_id},#{user_id},#{state})")
	int add(Order order);
	@Select("select * from order where id=#{id}")
	Order selectOrder(@Param("id") int id);
	@Update("update order set state=#{state} where id=#{id}")
	int updateCart(@Param("state") String state,@Param("id") int id);
}
