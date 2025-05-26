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
		System.out.printf("이름: %s\n",this.name);
		System.out.printf("전화번호: %s\n",this.phoneNm);
		System.out.printf("이메일: %s\n",this.email);
		System.out.printf("주소: %s\n",this.addr);
		System.out.printf("그룹(친구/가족): %s\n",this.group);
	}
}
