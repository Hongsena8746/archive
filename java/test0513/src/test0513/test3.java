package test0513;
import java.util.Random;
import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("인덱스 수:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = rand.nextInt(9)+1;
			System.out.printf("a[%d]=%d\n",i,a[i]);
		}
		
	}

}
