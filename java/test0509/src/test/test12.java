package test;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a =sc.nextInt();
		System.out.println("정수 b: ");
		int b =sc.nextInt();
		int num=a;
		if(a>b)
			num=b;
		do {
			System.out.printf("%d\n",num++);
		}while(num <= a || num <= b);
		
		sc.close();
	}	

}
