package Interface;

public class Bphone implements Phone {
	
	@Override
	public void call() {
		System.out.println("��ȭ�����մϴ�");
	}
	
	@Override
	public void networkSpeed() {
		System.out.println("�����մϴ�");
		System.out.println("5G�Դϴ�.");
	}
	
	@Override
	public void Tvcontrol() {
		System.out.println("ž��Ǿ��ֽ��ϴ�.");
	}

}
