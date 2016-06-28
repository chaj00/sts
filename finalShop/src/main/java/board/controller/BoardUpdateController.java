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
public class BoardUpdateController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/board_update.do", method=RequestMethod.POST)
	public ModelAndView runUdate(HttpServletRequest req, BoardDTO board){
		service.update(board);
		return new ModelAndView("redirect:board_read.do?board_no="+board.getBoard_no());
	}
}
