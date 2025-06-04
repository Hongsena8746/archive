package exam01;
import java.util.Scanner;

public class excer08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("사람 수는 몇명:");
		int num = in.nextInt();
		
		int[] Scores = {80,65,32,90,100};
		
		System.out.println("1번의점수:"+Scores[0]);
		System.out.println("2번의점수:"+Scores[1]);
		System.out.println("3번의점수:"+Scores[2]);
		System.out.println("4번의점수:"+Scores[3]);
		System.out.println("5번의점수:"+Scores[4]);
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
//		System.out.println("합계는"+sum+"점입니다");
//		
//		
//		double avg = (double)sum/Scores.length;
//		System.out.println("평균은"+avg+"점입니다.");
//				
//
//	}
//
//}
