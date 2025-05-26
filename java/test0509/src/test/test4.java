package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x 값 : ");
		float x =sc.nextFloat();
		System.out.println("y 값 : ");
		float y =sc.nextFloat();
		
		System.out.printf("합계는 %.2f입니다\n",x+y);
		System.out.printf("평균은 %.2f입니다",(x+y)/2.);
		
		sc.close();
	}

}
