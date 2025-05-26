
public class MiniProject08 {
	
	
	
	public static class Member{   //필드를 저장해주고 
		String name;
		String phoneNum;
		String major;
		String grade;
		String email;
		String birth;
		String address;
	
	
	//인스턴스의 생성자를 이용해서 초기화 
	public Member(String name, String phoneNum,String major,String grade,String email,String birth,String address) {
	
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.birth = birth;
		this.address = address;	
	}
	
	
	public Member(String name,String phoneNum,String major,String grade,String email) {
	
		this(name,phoneNum,major,grade,email,null,null); //bith와 adess를 저장하지 않을 생성자 하나 만들기
			                             
	}
	
	
	public void print() {
		System.out.println("이름:"+ name);
		System.out.println("전화번호:"+ phoneNum);
		System.out.println("전공:"+ major);
		System.out.println("학년:"+ grade);
		System.out.println("이메일:"+ email);
		
		
		if(birth != null) {
			System.out.println("생일:"+ birth);
		} else {
			System.out.println("생일정보없음");
		}
		
		if(address != null) {
			System.out.println("주소:"+ address);
		} else {
			System.out.println("주소:정보없음");
		}
	}
	
	
	
	//여기에는 두가지 생성자를 이용 //main에서 static이 있어야 실행이되는것
	public static void main(String[] args) {
		//생일 주소가 있는 사용자를 출력
		Member member1 = new Member("SHKIM","010-9999-7777","컴퓨터","2","shkim@gmail.com","20000-10-11","서울");
		
		//생일 주소가 없는 사용자를 출력
		Member member2 = new Member("JJKIM","010-1111-3333","컴퓨터","2","jjkim@gmail.com"+" "+ " ");
	
		member1.print();
		System.out.println("-----------------------------");
		member2.print();
	}
	}
}
