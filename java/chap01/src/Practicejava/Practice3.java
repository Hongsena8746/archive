package Practicejava;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수값:");
		
		int a = in.nextInt();     
		int b = a % 10;
	    int c = a / 10;			
		
        System.out.println("마지막 자릿수는 " + b + "입니다");
        System.out.println("마지막 자릿수를 제외한 값은 " + c + "입니다");
        
       in.close(); 
        
	}

}
