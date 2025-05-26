package test0515;

import java.util.Scanner;

public class Member {
	
	String name;
	String phoneNum;
	String klass;
	int grade;
	String email;
    String birth = "정보없음";
	String address = "정보없음";
	
	public Member(String name, String phoneNum, String klass, int grade, String email) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNum = phoneNum;
		this.klass = klass;
		this.grade = grade;
		this.email = email;
	}
	
	public Member(String name, String phoneNum, String klass, int grade, String email, String birth, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNum = phoneNum;
		this.klass = klass;
		this.grade = grade;
		this.email = email;
		this.birth = birth;
		this.address = address;
	}
	
	public void getMember() {
		System.out.printf("이름 : %s\n",this.name);
		System.out.printf("전화번호 : %s\n",this.phoneNum);
		System.out.printf("전공 : %s\n",this.klass);
		System.out.printf("학년 : %d\n",this.grade);
		System.out.printf("이메일 : %s\n",this.email);
		System.out.printf("생일 : %s\n",this.birth);
		System.out.printf("주소 : %s\n",this.address);
	}
	
	public static void checkVaccin(int year) {
		if((2025-year)<13 || (2025-year) >= 60) {
			System.out.println("무료 예방접종이 가능합니다");
		}
		else {
			System.out.println("무료 접종 대상이 아닙니다");
		}
	}
	
	public static void healthCheck(int birth) {
		if((2025-birth)>=20) {
			if((2025-birth)%2==0)
				System.out.println("대한민국 성인의 경우 무료로 2년마다 건강검진을 받을 수 있습니다.");
			
			if(birth%2==0)
				System.out.println("짝수 해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 됩니다.");
			
			if ((2025-birth) >= 40)
				System.out.println("40세 이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = "자바";
//		int age = 22;
//		double height = 180;
//		boolean hasBook = true;
//		
//		System.out.printf("나의 이름은 %s 입니다.\n", name);
//		System.out.printf("나이는 %d살 입니다.키는 %.6f cm 입니다. '이것이 자바다' 책을 가지고 있습니다.%b\n", age, height, hasBook);
//		
//		Scanner sc = new Scanner(System.in);
//		int birth = sc.nextInt();
//		int birth = 2025 - age;
//		
//		checkVaccin(birth);
//		healthCheck(birth);
		
		Member memb1 = new Member("SHKIM","010-9999-7777","컴퓨터",2,"shkim@gmail.com","2000-10-11","서울");
		Member memb2 = new Member("JJKIM","010-1111-3333","컴퓨터",2,"jjkim@gmail.com");
		
		memb1.getMember();
		System.out.println("------------------------------------");
		memb2.getMember();
		
	}
}
