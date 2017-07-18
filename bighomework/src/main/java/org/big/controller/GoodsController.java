package org.big.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.big.domain.Cart;
import org.big.domain.Goods;
import org.big.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 处理物品请求控制器
 */
@Controller
public class GoodsController {
	/**
	 * 自动注入GoodsService
	 */
	@Autowired
	@Qualifier("goodsService")
	private GoodsService goodsService;
	
	/**
	 * 处理/goodsForm请求
	 */
	@RequestMapping(value="/goodsForm")
	public String goodsForm (Model model){
		//获取所有物品集合
		List<Goods> goods_list=goodsService.getAll();
		//将物品集合添加到model中
		model.addAttribute("goods_list",goods_list);
		// 跳转到goodsForm页面
		return "goodsForm";
	}
}
