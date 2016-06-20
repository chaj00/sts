package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.BoardService;


@Controller
public class ListController{
	@Autowired
	BoardService service;
	

	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView runList(){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist", service.getMemberList());
		
		mav.setViewName("list");
		
		return mav;
	}



}
