package sec01.exam08;

import sec01.exam08.Calculator;
import sec01.exam08.User1;
import sec01.exam08.User2;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		 
		User1 user1 = new User1();      //user1스레드생성
		user1.setCalculator(calculator);//공유객체설정
		user1.start();					//user1스레드 시작
		
		User2 user2 = new User2();		//user2스레드생성		  
		user2.setCalculator(calculator);//공유객체설정
		user2.start();					//user1스레드 시작
	}
}
