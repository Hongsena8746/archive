
public class MiniProject08 {
	
	
	
	public static class Member{   //�ʵ带 �������ְ� 
		String name;
		String phoneNum;
		String major;
		String grade;
		String email;
		String birth;
		String address;
	
	
	//�ν��Ͻ��� �����ڸ� �̿��ؼ� �ʱ�ȭ 
	public Member(String name, String phoneNum,String major,String grade,String email,String birth,String address) {
	
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.birth = birth;
		this.address = address;	
	}
	
	
	public Member(String name,String phoneNum,String major,String grade,String email) {
	
		this(name,phoneNum,major,grade,email,null,null); //bith�� adess�� �������� ���� ������ �ϳ� �����
			                             
	}
	
	
	public void print() {
		System.out.println("�̸�:"+ name);
		System.out.println("��ȭ��ȣ:"+ phoneNum);
		System.out.println("����:"+ major);
		System.out.println("�г�:"+ grade);
		System.out.println("�̸���:"+ email);
		
		
		if(birth != null) {
			System.out.println("����:"+ birth);
		} else {
			System.out.println("������������");
		}
		
		if(address != null) {
			System.out.println("�ּ�:"+ address);
		} else {
			System.out.println("�ּ�:��������");
		}
	}
	
	
	
	//���⿡�� �ΰ��� �����ڸ� �̿� //main���� static�� �־�� �����̵Ǵ°�
	public static void main(String[] args) {
		//���� �ּҰ� �ִ� ����ڸ� ���
		Member member1 = new Member("SHKIM","010-9999-7777","��ǻ��","2","shkim@gmail.com","20000-10-11","����");
		
		//���� �ּҰ� ���� ����ڸ� ���
		Member member2 = new Member("JJKIM","010-1111-3333","��ǻ��","2","jjkim@gmail.com"+" "+ " ");
	
		member1.print();
		System.out.println("-----------------------------");
		member2.print();
	}
	}
}
