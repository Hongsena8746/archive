package exam01;
import java.util.Scanner;

public class excer10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Scores[][] = new int[3][2];
		
		System.out.println("3명의 영어, 수학점수를 입력하세요.");
		
		System.out.println("1번 영어:");
		Scores[0][0] = in.nextInt();
		System.out.println("수학:");
		Scores[0][1] = in.nextInt();
		
		System.out.println("2번 영어:");
		Scores[1][0] = in.nextInt();
		System.out.println("수학:");
		Scores[2][1] = in.nextInt();
		
		System.out.println("3번영어:");
		Scores[2][0] = in.nextInt();
		System.out.println("수학");
		Scores[2][1] = in.nextInt();
		
		
		
		System.out.println();
		System.out.println("NO.\t영어\t수학\t평균");
		
		double englishTotal = 0;
		double mathTotal = 0;
		
		
		
		for(int i=0; i<3; i++) {
			int eng = Scores[i][0];
			int math = Scores[i][1];
			double avg = (eng + math) / 2.0;
			
			
			englishTotal += eng;
			mathTotal += math;
			
			System.out.printf("%d\t%d\t%d\t.1f\n", i=1, eng , math, avg);
		}	
			
			//평균이여서 f 
		System.out.printf("평균\t%.1f\t%.1f\n", englishTotal/3.0, mathTotal/3.0);
		
		
	in.close();
	}

}
