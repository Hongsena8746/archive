package exam01;

//�迭
public class excer02 {

	public static void main(String[] args) {
		
		//�̷��� �ڵ��ϸ� ��ȿ������
//		int score1 = 60;
//		int score2 = 87;
//		int score3 = 67;
//		int score4 = 93;
//		int score5 = 77;
//		int score6 = 85;
//		int score7 = 89;
//		int score8 = 55;
//		int score9 = 90;
//		int score10 = 57;
//		
//		int sum = score1;
//		sum += score2;
//		sum += score3;
//		sum += score4;
//		sum += score5;
//		sum += score6;
//		sum += score7;
//		sum += score8;
//		sum += score9;
//		sum += score10;
//		
//		int avg = sum/10;
//		System.out.println(avg);
//		
		
		
		//score[�ε���]�� �̿��ؼ� for�� ���ǹ��Ἥ 
//		int[] score = {60,87,67,93,77,85,89,55,90,57};
//		int sum = 0;
//		for(int i=0; i< score.length; i++) {
//			sum += score[i];
//		}
//		int avg = sum/score.length;
//		System.out.println(avg);
//	}
//}
		
		
		
		
//		�� ������� �迭 ����
//		int scores[] = {83, 90, 87};
//		//int[] scores���ص� �������
//		
//		System.out.println("scores[0]:"+scores[0]);
//		System.out.println("scores[1]:"+scores[1]);
//		System.out.println("scores[2]:"+scores[2]);
//		
//		//for������ؼ� 
//		int sum =0;
//		for(int i=0; i<3; i++) {
//			sum+=scores[i];
//		}
//		System.out.println("���հ�:"+sum); // ���հ� ->>sum
//		
//		//double-> �Ǽ� 
//		double avg = (double) sum/3;
//		System.out.println("���:"+avg); //��� ->>avg(average)		
//	}
//
//}




		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1+=scores[i];	
		}
		System.out.println("����:"+sum1);
		
		
		int sum2 =add(new int[] {83,90,87});
		System.out.println("����:"+sum2);
		System.out.println();
	  }
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];		
	    }
		return sum;
		
		
		
		
		
	}
}
