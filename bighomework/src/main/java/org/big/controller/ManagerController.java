package org.big.controller;

import javax.servlet.http.HttpSession;

import org.big.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mchange.v1.cachedstore.CachedStore.Manager;

@Controller
public class ManagerController {
	@Autowired
	@Qualifier("managerService")
	private ManagerService managerService;
	@RequestMapping(value="/managerlogin")
	 public ModelAndView managerlogin(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session){
		Manager manager=managerService.managerlogin(loginname, password);
		if(manager!=null){
			session.setAttribute("manager",manager);
			mv.setView(new RedirectView("./orderForm"));
		}else{
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("manager");
		}
		return mv;
	}
}
