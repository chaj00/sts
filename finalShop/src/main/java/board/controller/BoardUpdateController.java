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
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public ModelAndView runUdate(HttpServletRequest req, BoardDTO user){
		System.out.println("update"+user);
		service.update(user);
		return new ModelAndView("redirect:board_list.do");
	}
}
