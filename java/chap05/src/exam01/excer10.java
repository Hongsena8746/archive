package exam01;
import java.util.Scanner;

public class excer10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int Scores[][] = new int[3][2];
		
		System.out.println("3���� ����, ���������� �Է��ϼ���.");
		
		System.out.println("1�� ����:");
		Scores[0][0] = in.nextInt();
		System.out.println("����:");
		Scores[0][1] = in.nextInt();
		
		System.out.println("2�� ����:");
		Scores[1][0] = in.nextInt();
		System.out.println("����:");
		Scores[2][1] = in.nextInt();
		
		System.out.println("3������:");
		Scores[2][0] = in.nextInt();
		System.out.println("����");
		Scores[2][1] = in.nextInt();
		
		
		
		System.out.println();
		System.out.println("NO.\t����\t����\t���");
		
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
			
			//����̿��� f 
		System.out.printf("���\t%.1f\t%.1f\n", englishTotal/3.0, mathTotal/3.0);
		
		
	in.close();
	}

}
