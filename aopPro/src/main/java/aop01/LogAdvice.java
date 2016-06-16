package aop01;
//모든 클래스에 적용할 공통의 모듈 - 비지니스로직 외적인 부분
public class LogAdvice {
	public void log(){
		System.out.println("===================로그기록...===================");
	}
}
