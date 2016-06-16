package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop01.DAO;
import aop01.UserDTO;

public class AOPTest02 {

	public static void main(String[] args) {
		ApplicationContext factory
			= new ClassPathXmlApplicationContext("config/aopbean02.xml");
		DAO dao = (DAO)factory.getBean("userdao");
		dao.getUser();
		dao.getUserLIst(new UserDTO());
		dao.addUser(new UserDTO());
		dao.selectAll();

	}

}
