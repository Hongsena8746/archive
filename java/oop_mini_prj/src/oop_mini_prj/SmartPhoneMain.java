package oop_mini_prj;

import java.util.Scanner;
import oop_mini_prj.SmartPhone;

public class SmartPhoneMain {
	
	public static void printMenu() {
		System.out.println("1.연락처 등록");
		System.out.println("2.모든 연락처 출력");
		System.out.println("3.연락처 검색");
		System.out.println("4.연락처 삭제");
		System.out.println("5.연락처 수정");
		System.out.println("6.프로그램 종료");
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
				System.out.print("검색할 연락처 이름: ");
				sp.searchAddr(sc.next());
				break;
			case 4:
				System.out.print("삭제할 연락처 이름: ");
				sp.deleteAddr(sc.next());
				break;
			case 5:
				System.out.print("수정할 연락처 이름: ");
				sp.editAddr(sc.next(), sp.inputAddrData());
				break;
			default:
				sc.close();
				System.exit(0);
			}
		}
		
	}

}
