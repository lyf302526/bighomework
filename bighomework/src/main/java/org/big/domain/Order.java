package org.big.domain;

import java.util.List;

public class Order {
	private Integer id;
	private List<Goods> goods;
	private Integer count;
	private Integer goods_id;
	private Integer user_id;
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id= goods_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString(){
		return "order[id="+id+",goods="+goods+",count="+count+",goods_id="+goods_id+",user_id="+user_id+","
				+ "state="+state+"]";
	}
}
