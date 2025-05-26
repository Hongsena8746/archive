package Cafeteria;

public class Student2 extends LunchMenu {

	public Student2(int rice, int bulgogi, int banana, int milk, int amond) {
	
	super(rice, bulgogi, banana, milk, amond);

	}

	@Override
	public int calculate() {
	
	return rice+bulgogi+milk+almond;
	
	}

}
