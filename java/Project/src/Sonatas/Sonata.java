package Sonatas;

public abstract class Sonata {
	public String color;
	public String tire;
	public int displacement;
	public String handle;

	public Sonata(String color, String tire, int displacement, String handle) {
	
		this.tire = tire;
		
		this.displacement = displacement;
		
		this.handle = handle;
	
	}

	public void getSpec() {
	
		System.out.println("************************");
		
		System.out.println("����:"+color);
		
		System.out.println("Ÿ�̾�:"+ tire);
		
		System.out.println("��ⷮ:"+ displacement);
		
		System.out.println("�ڵ�:"+ handle);
		
		int tax;
	
		if (displacement > 2000) {
	
			tax = 1500;
	
		}else {
	
			tax = 1000;
	
		}
	
		System.out.println("����:"+tax);
	
		System.out.println("************************");
	
	}

}