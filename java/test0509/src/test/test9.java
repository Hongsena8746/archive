package test;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a =sc.nextInt();
		System.out.println("정수 b: ");
		int b =sc.nextInt();
		int num = 0;
		if(b>=a) {
			num = a;
			a = b;
			b = num;
		}	
		
		System.out.printf("변수 a는 %d입니다\n변수 b는 %d입니다",a,b);
		
		sc.close();
	}

}
