package Interface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("A Phone");
		Phone Aphone = new Aphone();
		Aphone.call();
		Aphone.networkSpeed();
		Aphone.Tvcontrol();
		
		System.out.println("---------------");
		
		System.out.println("B Phone");
		Phone Bphone = new Bphone();
		Bphone.call();
		Bphone.networkSpeed();
		Bphone.Tvcontrol();
		
		System.out.println("---------------");
		
		System.out.println("C phone");
		Phone Cphone = new Cphone();
		Cphone.call();
		Cphone.networkSpeed();
		Cphone.Tvcontrol();
		
		System.out.println("---------------");
	}
}	





