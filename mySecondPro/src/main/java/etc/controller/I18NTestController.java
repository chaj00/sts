package etc.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;

@Controller
public class I18NTestController {
	@Autowired
	LocaleResolver resolver;
	
	@RequestMapping("/i18ntest.do")
	public ModelAndView showPage(String lang, HttpServletRequest req, HttpServletResponse res) 
			throws Exception{
		//언어 정보를 이용해서 Locale을 객체를 생성
		Locale locale = new Locale(lang);
		
		//Locale객체를 LocaleResolver에 셋팅
		resolver.setLocale(req, res, locale);
		
		//요청과 관련된 Locale정보를 리턴
		resolver.resolveLocale(req);
		
		return new ModelAndView("i18ntest", "command", new MyEmpDTO());
	}
	
}
