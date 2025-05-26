package Interface;

public class Bphone implements Phone {
	
	@Override
	public void call() {
		System.out.println("전화가능합니다");
	}
	
	@Override
	public void networkSpeed() {
		System.out.println("가능합니다");
		System.out.println("5G입니다.");
	}
	
	@Override
	public void Tvcontrol() {
		System.out.println("탑재되어있습니다.");
	}

}
