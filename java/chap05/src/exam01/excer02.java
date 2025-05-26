package exam01;

//배열
public class excer02 {

	public static void main(String[] args) {
		
		//이렇게 코딩하면 비효율적임
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
		
		
		//score[인덱스]를 이용해서 for문 조건물써서 
//		int[] score = {60,87,67,93,77,85,89,55,90,57};
//		int sum = 0;
//		for(int i=0; i< score.length; i++) {
//			sum += score[i];
//		}
//		int avg = sum/score.length;
//		System.out.println(avg);
//	}
//}
		
		
		
		
//		값 목록으로 배열 생성
//		int scores[] = {83, 90, 87};
//		//int[] scores로해도 상관없다
//		
//		System.out.println("scores[0]:"+scores[0]);
//		System.out.println("scores[1]:"+scores[1]);
//		System.out.println("scores[2]:"+scores[2]);
//		
//		//for문사용해서 
//		int sum =0;
//		for(int i=0; i<3; i++) {
//			sum+=scores[i];
//		}
//		System.out.println("총합계:"+sum); // 총합계 ->>sum
//		
//		//double-> 실수 
//		double avg = (double) sum/3;
//		System.out.println("평균:"+avg); //평균 ->>avg(average)		
//	}
//
//}




		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1+=scores[i];	
		}
		System.out.println("총합:"+sum1);
		
		
		int sum2 =add(new int[] {83,90,87});
		System.out.println("총합:"+sum2);
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
