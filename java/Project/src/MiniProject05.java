
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
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료접종대상이 아닙니다.");
		}
	}
	
	
	public void healthCheck(int year) {
		int thisYear = 2025;
		int age = thisYear - year;
		
		if(age>=20) {
			System.out.println("무료로 2년마다 건강검진 가능 대상자");
		} else if(age>40) {
			System.out.println("암검진가능 대상자");	
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.name = "자바";
		member.age = 22;
		member.height = 180.000000;
		member.hasBook = true;
		
		System.out.println("나의 이름은"+ member.name + "입니다.");
		System.out.println("나이는"+member.age + "입니다.");
		System.out.println("키는"+ member.height + "cm입니다.");
		
		
		int year = 1978;
		
		  // 여기서 인스턴스를 생성해야 비정적 메서드 호출이 가능하다.
		MiniProject05 project = new MiniProject05();
		project.checkVaccin(year);
		project.healthCheck(year);
	}

}
