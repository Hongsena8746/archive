package Practicejava;
import java.util.Scanner;


public class Practice8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수값:");
		int a = in.nextInt();
		
		if (a <= 0) {System.out.println("양수가 아닌 값을 입력했네요");
		
		}
		
		int b = a % 3;
		
		if (b == 0) {
            System.out.println("이 값은 3으로 나누어집니다.");
        } 
		else if (b == 1) {
            System.out.println("이 값은 3을 나눈 나머지는 1입니다.");
        } 
		else if (b == 2) {
            System.out.println("이 값은 3을 나눈 나머지는 2입니다.");
		}
		
		
        in.close();

	}

}
