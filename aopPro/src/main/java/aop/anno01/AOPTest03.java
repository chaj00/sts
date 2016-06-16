package aop.anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest03 {

	public static void main(String[] args) {
		ApplicationContext factory
			= new ClassPathXmlApplicationContext("config/aopanno.xml");
		DAO dao = (DAO)factory.getBean("userdao");
		dao.getUser();
		dao.getUserLIst(new UserDTO());
		dao.addUser(new UserDTO());
		dao.deleteUser(new UserDTO());
		dao.selectAll();

	}

}
