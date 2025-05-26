package test;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		
		int num =sc.nextInt();
		
		System.out.printf("절대값은: %d입니다",(num < 0) ? num * -1 : num);
		
		sc.close();
	}

}
