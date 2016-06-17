package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class LoginMybatisController {
	
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/mybatislogin.do", method=RequestMethod.GET)
	public String showPage(){
		return "mybatislogin";
	}
	@RequestMapping(value="/mybatislogin.do", method=RequestMethod.POST)
	public ModelAndView runLogin(HttpServletRequest req, MyEmpDTO user){
		service.login(user);
		return new ModelAndView("redirect:index.do");
	}

}
