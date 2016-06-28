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
public class BoardReadController {
	@Autowired
	BoardService service;
	

	@RequestMapping(value="/board_read.do", method=RequestMethod.GET)
	public ModelAndView runRead(HttpServletRequest req, String board_no){
		service.count_update(board_no);
		return new ModelAndView("board/detail","boardlist", service.read(board_no));
	}
	
	@RequestMapping(value="/board_read.do", method=RequestMethod.POST)
	public ModelAndView runUdateRead(HttpServletRequest req, String board_no){
		return new ModelAndView("board/update","boardlist", service.read(board_no));
	}

}
