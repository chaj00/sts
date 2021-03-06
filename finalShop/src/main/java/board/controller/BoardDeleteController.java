package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.BoardService;

@Controller
public class BoardDeleteController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/board_delete.do", method=RequestMethod.GET)
	public ModelAndView runDelete(HttpServletRequest req, String board_no){
		service.delete(board_no);
		return new ModelAndView("redirect:board_list.do");
	}
	
}
