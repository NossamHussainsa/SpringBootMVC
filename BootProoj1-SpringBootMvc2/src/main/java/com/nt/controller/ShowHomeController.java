package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ShowHomeController {
	@RequestMapping("/welcome")
	public String requestMethodName() {
	    return "home";
	}
@RequestMapping("/wish")
	public ModelAndView getWishMessage()
	{
	LocalDateTime ldt=LocalDateTime.now();
	int hour=ldt.getHour();
	String result="";
	if(hour>12)
		result="goodAfterNoon";
	else
		result="goodMorning";
	ModelAndView mav=new ModelAndView();
	mav.addObject("msg", result);
	mav.setViewName("display");
		return mav;
		
	}
}
