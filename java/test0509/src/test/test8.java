package test;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a: ");
		int a =sc.nextInt();
		System.out.println("정수 b: ");
		int b =sc.nextInt();
		
		System.out.printf("%s",(a-b>10 | b-a>10) ? "두값의 차이는 10이상입니다" : "두값의 차이는 9이하입니다");
		
		sc.close();
	}

}
