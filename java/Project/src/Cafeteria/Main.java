package Cafeteria;

public class Main {

	public static void main(String[] args) {
	
	LunchMenu student1 = new Student1 (Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);
	
	LunchMenu student2 = new Student2 (Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);

//또는

// 각 항목의 '수량'을 넣어야 합니다. 예: 밥 1, 불고기 1, 바나나 1, 우유 1, 아몬드 1

//    LunchMenu student1 = new Student1(1, 1, 1, 1, 1);

//    LunchMenu student2 = new Student2(1, 1, 0, 1, 1); // 바나나는 안 먹음

	System.out.println("Student1 식비는"+ student1.calculate() +"원입니다.");
	
	System.out.println("Student2 식비는"+ student2.calculate() +"원입니다.");
	
	}

}
