package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String showPage(){
		return "login/form";
	}
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String runLogin(HttpServletRequest req, MyEmpDTO user){
		
		MyEmpDTO loginuser = service.login(user);

		if( loginuser != null){
			req.getSession().setAttribute("user", loginuser);
			return "index";
		}else{
			return "login/form";
		}
			
		
		
	}

}
