package Practicejava;
import java.util.Scanner;


public class Practice7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("����A:");
		int a = in.nextInt();
		System.out.println("����B:");
		int b = in.nextInt();

		if(a>b ) {System.out.println("����B�� A�� ����Դϴ�.");}
			else if (a<b) {
			System.out.println("����B�� A�� ����� �ƴϴ�.");}
			
		
		
		in.close();

	}

}
