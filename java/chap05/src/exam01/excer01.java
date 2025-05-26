package exam01;


//참조타입
//public class excer01 {
//
//	public static void main(String[] args) {
//		String strVar1 = "신민철";
//		String strVar2 = "신민철";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("strVar1과 strVar2는 참조가 같음");
//		} else {
//		  System.out.println("strVar1과 strVar2는 참조가 다름");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1과 strVar2는 문자열이 같음");
//			// 문자열이 같은지 보려면 string 객체에 equals()메소드 사용하기
//		}
//		
//		String strVar3 = new String("신민철");
//		String strVar4 = new String("신민철");
//		
//		if(strVar3 == strVar4) {
//			System.out.println("strVar3과 strVar4는 참조가 같음");
//		} else {
//			System.out.println("strVar3과 strVar4는 참조가 다름");
//		}	
//		if(strVar3.equals( strVar4)) {
//			System.out.println("strVar3와 strVar4는 문자열이같은");		
//		}
//
//	}
//
//}




public class excer01 {
	public static void main(String[]args) {
		String strVar1 = "홍세나";
		String strVar2 = "장희준";
		
		if(strVar1 != strVar2) {
			System.out.println("strVar1과 strVar2는 참조가같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}
		
		String strVar3 = new String("학생이다");
		String strVar4 = new String("나는 학생이다");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3와 strVar는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이같음");
		} else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
	}
}





//package exam01;
//
//public class excer01 {
//
//	public static void main(String[] args) {
//		int var1 = 10;
//		int var2 = 10;
//		String var3 = "AB";
//		String var4 = "AB";
//		String var5 = new String("AB");
//		
//		System.out.println(var1==var2);
//		System.out.println(var1!=var2);
//		System.out.println(var3==var4);
//		System.out.println(var3!=var4);
//		System.out.println(var4.equals(var5));
//				
//
//	}
//
//}