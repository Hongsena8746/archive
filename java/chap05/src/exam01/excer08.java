package exam01;
import java.util.Scanner;

public class excer08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("��� ���� ���:");
		int num = in.nextInt();
		
		int[] Scores = {80,65,32,90,100};
		
		System.out.println("1��������:"+Scores[0]);
		System.out.println("2��������:"+Scores[1]);
		System.out.println("3��������:"+Scores[2]);
		System.out.println("4��������:"+Scores[3]);
		System.out.println("5��������:"+Scores[4]);
	}	
}		
	
//		int sum = 0;
//		for(int i=0; i<Scores.length; i++) {
//			sum += Scores[i];
//			
//			if(Scores[i] > max ) {
//				max = Scores[i];	
//			}
//			if(Scores[i] < min ) {
//				min = Scores[i];
//			
//			}
//		} 
		
//		
//		System.out.println("�հ��"+sum+"���Դϴ�");
//		
//		
//		double avg = (double)sum/Scores.length;
//		System.out.println("�����"+avg+"���Դϴ�.");
//				
//
//	}
//
//}
