package com.project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projectbackend.dao.CategoryDAO;

@Controller

public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	//passing the list of categories
	mv.addObject("categories", categoryDAO.list());
	
	
	@RequestMapping(value={"/","/home","/index"})
 public ModelAndView Index()
 {
		ModelAndView mv =  new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
 }
	@RequestMapping(value="/about")
	 public ModelAndView about()
	 {
			ModelAndView mv =  new ModelAndView("page");
			mv.addObject("title","About Us");
			mv.addObject("userClickAbout",true);
			return mv;
	 }
	@RequestMapping(value="/contact")
	 public ModelAndView contact()
	 {
			ModelAndView mv =  new ModelAndView("page");
			mv.addObject("title","Contatc Us");
			mv.addObject("userClickContact",true);
			return mv;
	 }
	
	
	
}
