package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory;  // �Ű����� memory�ʵ忡 ����
		try {
			Thread.sleep(1000);           // try~ catch {}���� �����带 1�ʰ� �Ͻ� ������Ŵ
		}catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ";" + this.memory);
	}						          //������ �̸���� 					//�޸𸮰�
}
