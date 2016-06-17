package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;

@Controller
public class LogoutMybatisController {
	
	@RequestMapping(value="logout.do", method=RequestMethod.GET)
	public ModelAndView runLogOut(HttpServletRequest req){

		HttpSession ses = req.getSession(false);
		
		if(ses!=null){
			ses.invalidate();
			
		}
		return new ModelAndView("redirect:index.do");
	}
}
