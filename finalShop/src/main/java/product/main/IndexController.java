package product.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import product.controller.ProductController;

@Controller
public class IndexController {
	
	@RequestMapping("/index.do")
	public ModelAndView main(){
		//prd.showList(req, null);
		
		return new ModelAndView("redirect:prdlist.do");
		
	}

}
