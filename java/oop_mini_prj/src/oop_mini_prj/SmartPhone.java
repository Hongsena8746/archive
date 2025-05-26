package oop_mini_prj;

import java.util.Scanner;

public class SmartPhone {
	Addr addrs[] = new Addr[10];
	
	public Addr inputAddrData() {
		
		Scanner sc = new Scanner(System.in);
		Addr ad = new Addr();
		
		System.out.print("�̸�: ");
		ad.setName(sc.next());
		System.out.print("��ȭ��ȣ: ");
		ad.setPhoneNm(sc.next());
		System.out.print("�̸���: ");
		ad.setEmail(sc.next());
		System.out.print("�ּ�: ");
		ad.setAddr(sc.next());
		System.out.print("�׷�(ģ��/����): ");
		ad.setGroup(sc.next());
		
		return ad;
	}
	
	public void addAddr(Addr ad) {
		int i;
		for(i = 0; i<addrs.length; i++) {
			if(this.addrs[i] == null) {
				this.addrs[i] = ad;
				break;
			}
		}
		System.out.printf(">>>�����Ͱ� ����Ǿ����ϴ�.(%d)\n",i+1);
	}
	
	public void printAddr(Addr ad) {
		ad.printinfo();
	}
	
	public void printAllAddr() {
		for(int i =0; i<addrs.length; i++) {
			if(this.addrs[i] != null)
				this.addrs[i].printinfo();
		}
	}
	
	public void searchAddr(String name) {
		for(int i = 0; i<addrs.length; i++)
			if(this.addrs[i] != null && this.addrs[i].getName().equals(name))
					this.addrs[i].printinfo();
	}
	
	public void deleteAddr(String name) {
		for(int i = 0; this.addrs[i] != null && i<addrs.length; i++) {
			if(this.addrs[i].getName().equals(name)) {
				for(int j = i; this.addrs[j] != null && j<addrs.length - 1; j++) {
					addrs[j] = addrs[j+1];
					addrs[j+1] = null;
				}
			}
		}
	}
	
	public void editAddr(String name,Addr newAddr) {
		for(int i = 0; i<addrs.length; i++)
			if(this.addrs[i] != null && this.addrs[i].getName().equals(name))
					this.addrs[i] = newAddr;
	}
}
