package etc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import emp.dto.MyEmpDTO;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		MyEmpDTO user = (MyEmpDTO)request.getSession().getAttribute("user");
		
		if(user == null){
			response.sendRedirect("login.do");
			return false;
		}
		
		return true;
	}

	
}
