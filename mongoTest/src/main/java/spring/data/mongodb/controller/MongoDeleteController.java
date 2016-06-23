package spring.data.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.data.mongodb.dto.ScoreDTO;
import spring.data.mongodb.service.ScoreMongoService;


@Controller
public class MongoDeleteController {
	@Autowired
	ScoreMongoService service;
	
	@RequestMapping(value="/score/delete")
	public String delete(String key,String value){
		service.delete(key, value);
		
		return "redirect:/score/list?pageNo=0";
	
	}

}
