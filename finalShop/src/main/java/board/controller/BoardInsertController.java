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
public class BoardInsertController {
	@Autowired
	BoardService service;
	
	//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
	@RequestMapping(value="/board_insert.do", method=RequestMethod.GET)
	public String showPage(){
		return "board/input";
	}
	//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ����� ����
	@RequestMapping(value="/board_insert.do", method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req, BoardDTO board, String id){
		service.insert(board);
		return new ModelAndView("redirect:board_list.do");
	}
	
}
