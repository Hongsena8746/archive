package Practicejava;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������:");
		
		int a = in.nextInt();     
		int b = a % 10;
	    int c = a / 10;			
		
        System.out.println("������ �ڸ����� " + b + "�Դϴ�");
        System.out.println("������ �ڸ����� ������ ���� " + c + "�Դϴ�");
        
       in.close(); 
        
	}

}
