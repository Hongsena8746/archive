package Store;

public class MainClass {

	public static void main(String[] args) {
		Hqstore[] stores = { new Store1(), new Store2(), new Store3() };
	
	
	for(int i =0; i< stores.length; i++) {
		System.out.println((i+1)+ "호점 가격표입니다.");
		stores[i].jajangmyeon();
		stores[i].jjamppong();
		stores[i].tangsuyuk();
		stores[i].gunmandu();
		stores[i].gonggibab();
		System.out.println("=====================");
		}
	}
}
