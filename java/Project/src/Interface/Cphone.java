package Interface;

public class Cphone implements Phone {
	
	@Override
	public void call() {
		System.out.println("��ȭ�����մϴ�.");
	}
	
	@Override
	public void networkSpeed() {
		System.out.println("�����մϴ�.");
		System.out.println("4G�Դϴ�.");
	}
	
	@Override
	public void Tvcontrol() {
		System.out.println("��ž��Ǿ��ֽ��ϴ�.");
	}

}
