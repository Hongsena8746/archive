package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 : ");
		
		int num =sc.nextInt();
		
		System.out.printf("마지막 자릿수를 제외한 값은 %d입니다\n",num/10);
		System.out.printf("마지막 자릿수는 %d입니다",num%10);
		
		sc.close();
	}

}
