package Practicejava;
import java.util.Scanner;


public class Practice5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		 System.out.print("�̸��� �Է��ϼ���: ");
	     String name = in.nextLine();

	     System.out.print("���̸� �Է��ϼ���: ");
	     int age = in.nextInt();
	     
	     
	     System.out.println("�̸�: "+ name + "�ȳ��ϼ���!"+ age + "�̳׿�!");
	    
	        
		in.close();
		
	}

}
