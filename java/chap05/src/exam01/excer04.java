package exam01;

public class excer04 {

	public static void main(String[] args) {
		//�迭�� ����legth�ʵ�
//		int[] scores = {83, 90, 87};
//		
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			sum += scores[i];
//		}
//		System.out.println("����:"+sum);
//		
//		double avg = (double)sum/ scores.length;
//		System.out.println("���:"+ avg);
//	}
//
//}
//
//
//
//		int[] scores = {2,45,67};
//		
//		int sum = 0;
//		for(int i=0; i<scores.legnth; i++) {
//			sum+= scores[i];
//		}
//		System.out.println("�հ�:"+sum);
//		
//		double avg = (double)sum/ scores.length;
//		System.out.println("���:"+avg);
//	}
//}



		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����:"+ sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("���:"+avg);
	
	}
}