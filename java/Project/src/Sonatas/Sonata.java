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
		
		System.out.println("색상:"+color);
		
		System.out.println("타이어:"+ tire);
		
		System.out.println("배기량:"+ displacement);
		
		System.out.println("핸들:"+ handle);
		
		int tax;
	
		if (displacement > 2000) {
	
			tax = 1500;
	
		}else {
	
			tax = 1000;
	
		}
	
		System.out.println("세금:"+tax);
	
		System.out.println("************************");
	
	}

}