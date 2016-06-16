package aop01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

public class LogAdvice {

	public void myLogPointcut(){}
	

	public void log(){
		System.out.println("===================로그기록...===================");
	}
}
