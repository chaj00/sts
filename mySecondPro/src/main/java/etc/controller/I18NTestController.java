package etc.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class I18NTestController {
	@Autowired
	LocaleResolver resolver;
	
	public ModelAndView showPage(String lang, HttpServletRequest req, HttpServletResponse res) 
			throws Exception{
		//언어 정보를 이용해서 Locale을 객체를 생성
		Locale locale = new Locale(lang);
		
		//Locale객체를 LocaleRwsolver에 셋팅
		resolver.setLocale(req, res, locale);
		resolver.resolveLocale(req);
		
		return new ModelAndView("i118ntest");
	}
	
}
