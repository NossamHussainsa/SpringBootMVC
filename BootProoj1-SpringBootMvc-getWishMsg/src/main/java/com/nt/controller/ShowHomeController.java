package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.Service.IWishGenerator;


@Controller
public class ShowHomeController {
	@Autowired
	private IWishGenerator service;
	@RequestMapping("/welcome")
	public String requestMethodName() {
	    return "home";
	}
	@RequestMapping("/wish")
	public String getWishMessage(Model model)
	{
		System.out.println("ShowHomeController.getWishMessage()==>"+model.getClass());
	String result=service.getWishMessage();
	//ModelAndView mav=new ModelAndView();
	model.addAttribute("msg", result);
	//mav.setViewName("display");
		return "display";
		
	}
}
