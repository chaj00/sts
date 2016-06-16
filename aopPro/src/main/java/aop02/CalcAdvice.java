package aop02;

public class CalcAdvice {
	private int val;
	
	public void set(){
		int rand = (int)(Math.random()*100)+1;
		
		if(rand<50){
			rand = 50;
		}else{
			rand = 100;
		}
		
		System.out.println("·£´ý¼ö=>"+rand);
		val = rand;
	}
	
	public void calc(){
		int result=0;
		for(int i=1; i<=val ; i++){
			result = result + i;
		}
		System.out.println("ÇÕ=>"+result);
	}

}
