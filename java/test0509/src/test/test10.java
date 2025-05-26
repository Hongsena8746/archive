package test;
import java.util.Random;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int test = rand.nextInt(3);
		
		System.out.println("컴퓨터가 낸 것은:");
		switch(test) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		default:
			System.out.println("보");
			break;
		}
		
	}

}
