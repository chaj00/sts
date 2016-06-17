package member.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.dto.MemberDTO;
import member.service.MemberService;

@Controller
public class LoginMybatisController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String showPage(){
		return "login/form";
	}
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String runLogin(HttpServletRequest req, MemberDTO user){
		
		MemberDTO loginuser = service.login(user);

		if( loginuser != null){
			req.getSession().setAttribute("user", loginuser);
			return "index";
		}else{
			return "login/form";
		}
			
		
		
	}

}
