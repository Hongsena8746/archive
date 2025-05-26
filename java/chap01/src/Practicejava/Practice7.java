package Practicejava;
import java.util.Scanner;


public class Practice7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("변수A:");
		int a = in.nextInt();
		System.out.println("변수B:");
		int b = in.nextInt();

		if(a>b ) {System.out.println("변수B가 A의 약수입니다.");}
			else if (a<b) {
			System.out.println("변수B는 A의 약수가 아니다.");}
			
		
		
		in.close();

	}

}
