package aop02;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class CalcAdvice {
	private int val;
	
	@Pointcut("execution(* aop01.UserDAO.*())")
	public void myLogPointcut(){}
	
	@Before("myLogPointcut()")
	public void set(){
		int rand = (int)(Math.random()*100)+1;
		
		if(rand<50){
			rand = 50;
		}else{
			rand = 100;
		}
		
		System.out.println("������=>"+rand);
		val = rand;
	}
	
	@After("myLogPointcut()")
	public void calc(){
		int result=0;
		for(int i=1; i<=val ; i++){
			result = result + i;
		}
		System.out.println("��=>"+result);
	}

}
