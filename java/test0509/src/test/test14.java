package test;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수값:");
		int a =sc.nextInt();
		int num=1;
		
		for(int i=1; i<=a; i++)
			num *= i;
		
		System.out.printf("1부터 %d까지의 곱은 %d입니다",a,num);
		sc.close();
	}

}
