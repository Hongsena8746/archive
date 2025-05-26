package test0513;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int max = 0,min = 0, sum = 0;
		System.out.println("사람 수는 몇명:");
		
		int n =sc.nextInt();
		int[] score = new int[n];
		System.out.println("점수를 입력하세요:");
		for(int i=0; i<n; i++) {
			System.out.printf("%d번의 점수:",i+1);
			
			score[i] = sc.nextInt();
			sum += score[i]; 
		}
		min = score[0];
		for(int i=0; i<n; i++) {
			if(max < score[i])
				max = score[i];
			
			if(min > score[i])
				min = score[i];
		}
		System.out.printf("합계는 %d점입니다\n",sum);
		System.out.printf("평균은 %.1f점입니다\n",sum/n*1.);
		System.out.printf("최고점은 %d입니다\n",max);
		System.out.printf("최저점은 %d입니다",min);
	}

}
