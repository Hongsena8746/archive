
public class MiniProject05 {
	
	public static class Member {
		String name;
		int age;
		double height;
		boolean hasBook;
	}
	
	public void checkVaccin(int year) {
		int thisYear = 2025;
		int age =  thisYear - year;
		
		if(age<13||age>60) {
			System.out.println("���Ό�������� �����մϴ�.");
		} else {
			System.out.println("������������� �ƴմϴ�.");
		}
	}
	
	
	public void healthCheck(int year) {
		int thisYear = 2025;
		int age = thisYear - year;
		
		if(age>=20) {
			System.out.println("����� 2�⸶�� �ǰ����� ���� �����");
		} else if(age>40) {
			System.out.println("�ϰ������� �����");	
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name = "�ڹ�";
		member.age = 22;
		member.height = 180.000000;
		member.hasBook = true;
		
		System.out.println("���� �̸���"+ member.name + "�Դϴ�.");
		System.out.println("���̴�"+member.age + "�Դϴ�.");
		System.out.println("Ű��"+ member.height + "cm�Դϴ�.");
		
		
		int year = 1978;
		
		  // ���⼭ �ν��Ͻ��� �����ؾ� ������ �޼��� ȣ���� �����ϴ�.
		MiniProject05 project = new MiniProject05();
		project.checkVaccin(year);
		project.healthCheck(year);
	}

}
