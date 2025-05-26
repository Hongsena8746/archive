package oop_mini_prj;

import java.util.Scanner;
import oop_mini_prj.SmartPhone;

public class SmartPhoneMain {
	
	public static void printMenu() {
		System.out.println("1.����ó ���");
		System.out.println("2.��� ����ó ���");
		System.out.println("3.����ó �˻�");
		System.out.println("4.����ó ����");
		System.out.println("5.����ó ����");
		System.out.println("6.���α׷� ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			printMenu();
			switch(sc.nextInt()) {
			case 1:
				sp.addAddr(sp.inputAddrData());
				break;
			case 2:
				sp.printAllAddr();
				break;
			case 3:
				System.out.print("�˻��� ����ó �̸�: ");
				sp.searchAddr(sc.next());
				break;
			case 4:
				System.out.print("������ ����ó �̸�: ");
				sp.deleteAddr(sc.next());
				break;
			case 5:
				System.out.print("������ ����ó �̸�: ");
				sp.editAddr(sc.next(), sp.inputAddrData());
				break;
			default:
				sc.close();
				System.exit(0);
			}
		}
		
	}

}
