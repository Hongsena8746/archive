package Cafeteria;

public class Main {

	public static void main(String[] args) {
	
	LunchMenu student1 = new Student1 (Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);
	
	LunchMenu student2 = new Student2 (Price.rice, Price.bulgogi, Price.banana, Price.milk, Price.almond);

//�Ǵ�

// �� �׸��� '����'�� �־�� �մϴ�. ��: �� 1, �Ұ�� 1, �ٳ��� 1, ���� 1, �Ƹ�� 1

//    LunchMenu student1 = new Student1(1, 1, 1, 1, 1);

//    LunchMenu student2 = new Student2(1, 1, 0, 1, 1); // �ٳ����� �� ����

	System.out.println("Student1 �ĺ��"+ student1.calculate() +"���Դϴ�.");
	
	System.out.println("Student2 �ĺ��"+ student2.calculate() +"���Դϴ�.");
	
	}

}
