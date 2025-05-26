package test;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변수 A: ");
		int A =sc.nextInt();
		System.out.println("변수 B: ");
		int B =sc.nextInt();
		
		System.out.printf("%s",(A%B==0) ? "B는 A의 약수입니다" : "B는 A의 약수가 아닙니다");
		
		sc.close();
	}

}
