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
		//��� ������ �̿��ؼ� Locale�� ��ü�� ����
		Locale locale = new Locale(lang);
		
		//Locale��ü�� LocaleRwsolver�� ����
		resolver.setLocale(req, res, locale);
		resolver.resolveLocale(req);
		
		return new ModelAndView("i118ntest");
	}
	
}
