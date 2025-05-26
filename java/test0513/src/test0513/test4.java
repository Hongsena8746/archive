package test0513;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int[][] score = new int[3][2];
		
		System.out.println("3명의 영어, 수학 점수를 입력하세요.");
		for(int i=0; i<3; i++) {
			System.out.printf("%d번 ",i+1);
			System.out.print("영어: ");
			score[i][0] = sc.nextInt();
			System.out.print("    수학: ");
			score[i][1] = sc.nextInt();
		}
		System.out.printf("No.\t영어\t수학\t평균\n");
		for(int i=0; i<3; i++) {
			System.out.printf("%d\t%d\t%d\t%.1f\n",i+1,score[i][0],score[i][1],(score[i][0]+score[i][1])/2.);
		}
		System.out.printf("평균\t%.1f\t%.1f",(score[0][0]+score[1][0]+score[2][0])/3.,(score[0][1]+score[1][1]+score[2][1])/3.);
	}

}
