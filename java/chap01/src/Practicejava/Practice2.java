package Practicejava;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		 
		 Scanner in = new Scanner(System.in);
		 
		 int a = in.nextInt();
	     int b = 100;
	     int sum = a + b;
	     System.out.println("정수값" + a);
	     System.out.println( b + "을 더한 값은 " + sum + "입니다.");
	     System.out.println( b + "을 뺀 값은 " + (a - b) + "입니다.");


	    in.close();
	}

}




