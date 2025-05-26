package Practicejava;
import java.util.Scanner;

public class Pracitce6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수값:");
		int a = in.nextInt();
		
		
		int Pracitce6 = Math.abs(a);
		
		System.out.println("절대값은:" + Pracitce6 + "입니다.");
		
		in.close();

	}

}


