package Practicejava;
import java.util.Scanner;


public class Practice8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("������:");
		int a = in.nextInt();
		
		if (a <= 0) {System.out.println("����� �ƴ� ���� �Է��߳׿�");
		
		}
		
		int b = a % 3;
		
		if (b == 0) {
            System.out.println("�� ���� 3���� ���������ϴ�.");
        } 
		else if (b == 1) {
            System.out.println("�� ���� 3�� ���� �������� 1�Դϴ�.");
        } 
		else if (b == 2) {
            System.out.println("�� ���� 3�� ���� �������� 2�Դϴ�.");
		}
		
		
        in.close();

	}

}
