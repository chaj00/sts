package emp.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import emp.service.MyEmpService;

@Controller
public class CountMybatisController {
	@Autowired
	MyEmpService service;
	@RequestMapping("/mybatiscount.do")
	public String getCount(){
		int result = service.count();
		System.out.println("�ο���==>"+result);
		return "index";
		
	}

}
