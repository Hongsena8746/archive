package test;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		
		int num =sc.nextInt();
		
		System.out.printf("100을 더한 값은 %d입니다\n",100+num);
		System.out.printf("100을 뺀 값은 %d입니다",100-num);
		
		sc.close();
	}

}
