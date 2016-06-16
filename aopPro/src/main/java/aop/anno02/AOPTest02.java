package aop.anno02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.anno01.DAO;
import aop.anno01.UserDTO;

public class AOPTest02 {

	public static void main(String[] args) {
		ApplicationContext factory
			= new ClassPathXmlApplicationContext("config/aopanno02.xml");
		DAO dao = (DAO)factory.getBean("userdao");
		dao.getUser();
		dao.getUserLIst(new UserDTO());
		dao.addUser(new UserDTO());
		dao.selectAll();

	}

}
