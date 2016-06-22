package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.BoardService;


@Controller
public class BoardListController{
	@Autowired
	BoardService service;
	

	@RequestMapping(value="/board_list.do", method=RequestMethod.GET)
	public ModelAndView runList(){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("boardlist", service.getBoardList());
		
		mav.setViewName("board/list");
		
		return mav;
	}



}
