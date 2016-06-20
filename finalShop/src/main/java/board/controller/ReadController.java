package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDTO;
import board.service.BoardService;

@Controller
public class ReadController {
	@Autowired
	BoardService service;
	

	@RequestMapping(value="/read.do", method=RequestMethod.GET)
	public ModelAndView runRead(HttpServletRequest req, BoardDTO user, String id){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", service.read(id));
		
		mav.setViewName("emp/detail");
		
		return mav;
	}
	
	@RequestMapping(value="/read.do", method=RequestMethod.POST)
	public ModelAndView runUdateRead(HttpServletRequest req, BoardDTO user){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", user);
		
		mav.setViewName("emp/update");
		
		return mav;
	}

}
