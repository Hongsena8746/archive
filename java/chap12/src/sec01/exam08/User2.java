package sec01.exam08;

import sec01.exam08.Calculator;

public class User2 extends Thread {
private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");				//스레드 이름 user2로 설정
		this.calculator = calculator;		//공유객채인 calculator를 필드에 저장
	}
	
	public void run() {
		calculator.setMemory(50);			//공유객체인 calculator의 메모리 50을 저장
	}	
}
