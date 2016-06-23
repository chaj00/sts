package spring.data.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.service.ScoreMongoService;


@Controller
public class MongoUpdateController {
	@Autowired
	ScoreMongoService service;
	
	@RequestMapping(value="/score/update",method=RequestMethod.POST)
	public String update(ScoreDTO document){
		service.update(document);
		return "redirect:/score/list?pageNo=0";
	
	}

}
