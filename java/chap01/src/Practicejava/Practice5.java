package Practicejava;
import java.util.Scanner;


public class Practice5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		 System.out.print("이름을 입력하세요: ");
	     String name = in.nextLine();

	     System.out.print("나이를 입력하세요: ");
	     int age = in.nextInt();
	     
	     
	     System.out.println("이름: "+ name + "안녕하세요!"+ age + "이네요!");
	    
	        
		in.close();
		
	}

}
