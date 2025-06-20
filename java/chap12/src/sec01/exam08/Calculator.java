package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;  // 매개값을 memory필드에 저장
		try {
			Thread.sleep(1000);           // try~ catch {}까지 스레드를 1초간 일시 정지시킴
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ";" + this.memory);
	}						          //스레드 이름얻기 					//메모리값
}
