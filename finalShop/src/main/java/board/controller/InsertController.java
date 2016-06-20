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
public class InsertController {
	@Autowired
	BoardService service;
	
	//get방식으로 요청될때 실행할 메소드 - insert페이지를 response
	@RequestMapping(value="/board_insert.do", method=RequestMethod.GET)
	public String showPage(){
		return "boardinput/form";
	}
	//post방식으로 요청될때 실행할 메소드 - 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/board_insert.do", method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req, BoardDTO user, String id){
		System.out.println(user+"~~~~~"+id);
		service.insert(user);
		return new ModelAndView("redirect:index.do");
	}
	
}
