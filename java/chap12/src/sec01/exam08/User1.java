package sec01.exam08;

import sec01.exam08.Calculator;

public class User1 extends Thread {
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");			//������ �̸��� user1�� ����
		this.calculator = calculator;	//������ü�� calculator�� �ʵ忡 ����
	}
	
	public void run() {
		calculator.setMemory(100);		//������ü�� calculator�� �޸𸮿� 100�� ����
	}

}

