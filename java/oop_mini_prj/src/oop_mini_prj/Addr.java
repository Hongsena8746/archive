package oop_mini_prj;

public class Addr {
	private String name ="";
	private String phoneNm ="";
	private String email = "";
	private String addr = "";
	private String group = "";
	
	public Addr() {
		this.name ="";
		this.phoneNm = "";
		this.email = "";
		this.email = "";
		this.group = "";
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNm() {
		return phoneNm;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNm(String phoneNm) {
		this.phoneNm = phoneNm;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void printinfo() {
		System.out.printf("�̸�: %s\n",this.name);
		System.out.printf("��ȭ��ȣ: %s\n",this.phoneNm);
		System.out.printf("�̸���: %s\n",this.email);
		System.out.printf("�ּ�: %s\n",this.addr);
		System.out.printf("�׷�(ģ��/����): %s\n",this.group);
	}
}
