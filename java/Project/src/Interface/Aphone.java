package Interface;

public class Aphone implements Phone {
	
	@Override
	public void call() {
    System.out.println("��ȭ �����մϴ�");
}


    @Override
    public void networkSpeed() {
    	System.out.println("�Ұ����մϴ�.");
        System.out.println("3G�Դϴ�.");
    }

    @Override
    public void Tvcontrol() {
        System.out.println("�� ž��Ǿ��ֽ��ϴ�.");
	}
}

