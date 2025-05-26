package Store;

public class Store2 extends Hqstore  {
	
	
	@Override
	public void jajangmyeon() {
		System.out.println("5000원입니다.");
	}
	
    @Override
    public void jjamppong() {
        System.out.println("5000원입니다.");
    }

    @Override
    public void tangsuyuk() {
        System.out.println("10000원입니다.");
    }
    
    
    @Override
    public void gunmandu() {
    	System.out.println("3000원입니다");
    }

    @Override
    public void gonggibab() {
    	System.out.println("무료입니다.");
    }

}