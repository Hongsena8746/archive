package Cafeteria;

public abstract class LunchMenu {

// ���� ������ �����ϴ� ������

	public int rice;
	
	public int bulgogi;
	
	public int banana;
	
	public int milk;
	
	public int almond;

//������-> �� ������ ������ ���޹޾� �ʱ�ȭ

public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {

	this.rice = rice;
	
	this.bulgogi = bulgogi;
	
	this.banana = banana;
	
	this.milk = milk;
	
	this.almond = almond;

}

//�߻� �޼��� �ڽ� Ŭ�������� �� �ĺ� ���

public abstract int calculate();

}
