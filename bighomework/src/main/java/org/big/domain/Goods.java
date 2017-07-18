package org.big.domain;

import java.io.Serializable;

public class Goods implements Serializable{
	private Integer id;            //id
	private String goods_name;     //物品名
	private String goods_id;
	private String discriber;      //描述
	private Double price;          //价格
	private String image;          //图片
	private Integer count;
	public Goods(){
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public String getGoods_name(){
		return goods_name;
	}
	public void setGoods_name(String goods_name){
		this.goods_name=goods_name;
	}
	public String getDiscriber(){
		return discriber;
	}
	public void setDiscriber(String discriber){
		this.discriber=discriber;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image=image;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Goods[id="+id+",goods_name="+goods_name+",discriber="+discriber
				+",price="+price+",image="+image+",count="+count+"]";
	}
}
