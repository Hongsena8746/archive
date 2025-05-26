package test0515;

import java.util.Scanner;

public class Calculator {
	public static void plus(int num1, int num2) {
		System.out.printf("num1 + num2 = %d\n", num1+ num2);
	}
	public static void minus(int num1, int num2) {
		if(num1>num2)
			System.out.printf("num1 - num2 = %d\n", num1-num2);
		else
			System.out.printf("num1 - num2 = %d\n", num2-num1);
	}
	public static void multi(int num1,int num2) {
		System.out.printf("num1 * num2 = %d\n", num1*num2);
	}
	public static void div(int num1,int num2) {
		System.out.printf("num1 / num2 = %d\n", num1/num2);
	}
	public static double calCircle(double r) {
		double pi =3.14;
		return 2*pi*r;
	}
	public static void main(String[] args) {
		int num1, num2;
		double r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오:");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하시오:");
		num2 = sc.nextInt();
		
		plus(num1, num2);
		minus(num1, num2);
		multi(num1, num2);
		div(num1, num2);
		
		System.out.print("반지름을 입력하시오 :");
		r = sc.nextDouble();
		
		System.out.printf("원의 둘레 : %.2f", calCircle(r));
		
		sc.close();
	}
}

