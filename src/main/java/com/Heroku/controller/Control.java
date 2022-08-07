package com.Heroku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Control {

	
	@RequestMapping("/check")
	public ModelAndView meth()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	
}
