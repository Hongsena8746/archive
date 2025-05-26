package Interface;

public class Cphone implements Phone {
	
	@Override
	public void call() {
		System.out.println("전화가능합니다.");
	}
	
	@Override
	public void networkSpeed() {
		System.out.println("가능합니다.");
		System.out.println("4G입니다.");
	}
	
	@Override
	public void Tvcontrol() {
		System.out.println("미탑재되어있습니다.");
	}

}
