package Cafeteria;

public abstract class LunchMenu {

// 음식 수량을 저장하는 변수들

	public int rice;
	
	public int bulgogi;
	
	public int banana;
	
	public int milk;
	
	public int almond;

//생성자-> 각 음식의 수량을 전달받아 초기화

public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {

	this.rice = rice;
	
	this.bulgogi = bulgogi;
	
	this.banana = banana;
	
	this.milk = milk;
	
	this.almond = almond;

}

//추상 메서드 자식 클래스에서 총 식비 계산

public abstract int calculate();

}
