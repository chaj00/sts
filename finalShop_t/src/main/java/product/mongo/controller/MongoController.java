package product.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.mongo.dto.MongoDTO;
import product.service.ProductMongoService;

@Controller
public class MongoController {
	@Autowired
	ProductMongoService service;
	
	@RequestMapping("/mongo/list")
	public ModelAndView getDocList(int pageNo){
		//List<ScoreDTO> mongolist = dao.findAll();
		List<MongoDTO> mongolist = service.findAll(pageNo);
		return new ModelAndView("list","mongolist",mongolist);
	}
}
