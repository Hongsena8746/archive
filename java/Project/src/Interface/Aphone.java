package Interface;

public class Aphone implements Phone {
	
	@Override
	public void call() {
    System.out.println("전화 가능합니다");
}


    @Override
    public void networkSpeed() {
    	System.out.println("불가능합니다.");
        System.out.println("3G입니다.");
    }

    @Override
    public void Tvcontrol() {
        System.out.println("미 탑재되어있습니다.");
	}
}

