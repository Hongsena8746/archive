package exam01;


//����Ÿ��
//public class excer01 {
//
//	public static void main(String[] args) {
//		String strVar1 = "�Ź�ö";
//		String strVar2 = "�Ź�ö";
//		
//		if(strVar1 == strVar2) {
//			System.out.println("strVar1�� strVar2�� ������ ����");
//		} else {
//		  System.out.println("strVar1�� strVar2�� ������ �ٸ�");
//		}
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
//			// ���ڿ��� ������ ������ string ��ü�� equals()�޼ҵ� ����ϱ�
//		}
//		
//		String strVar3 = new String("�Ź�ö");
//		String strVar4 = new String("�Ź�ö");
//		
//		if(strVar3 == strVar4) {
//			System.out.println("strVar3�� strVar4�� ������ ����");
//		} else {
//			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
//		}	
//		if(strVar3.equals( strVar4)) {
//			System.out.println("strVar3�� strVar4�� ���ڿ��̰���");		
//		}
//
//	}
//
//}




public class excer01 {
	public static void main(String[]args) {
		String strVar1 = "ȫ����";
		String strVar2 = "������";
		
		if(strVar1 != strVar2) {
			System.out.println("strVar1�� strVar2�� ����������");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		} else {
			System.out.println("strVar1�� strVar2�� ���ڿ��� �ٸ�");
		}
		
		String strVar3 = new String("�л��̴�");
		String strVar4 = new String("���� �л��̴�");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar�� ������ ����");
		} else {
			System.out.println("strVar3�� strVar�� ������ �ٸ�");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��̰���");
		} else {
			System.out.println("strVar3�� strVar4�� ���ڿ��� �ٸ�");
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