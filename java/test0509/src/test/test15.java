package test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 개의 *을 표시할까요?");
		int a =sc.nextInt();
		
		for(int i=0; i<(a/5); i++)
			System.out.println("*****");
		for(int i=0; i<(a%5); i++)
			System.out.print("*");
		
		sc.close();
	}

}
