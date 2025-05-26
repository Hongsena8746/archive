package test;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2이상의 정수값:");
		int a =sc.nextInt();
		int i=2;
		while(true) {
			if(a%i==0 && a!=i) {
				System.out.println("소수가 아닙니다");
				break;
			}
			i++;
			if(a==i) {
				System.out.println("소수입니다");
				break;
			}
		}
		sc.close();
	}

}
