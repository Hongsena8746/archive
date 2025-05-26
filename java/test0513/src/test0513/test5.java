package test0513;

//import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		System.out.print("Input Data: ");
		int a[] = {69,10,30,2,16,8,31,22};
		
		for(int j=0; j<a.length; j++)
			System.out.printf("%d ",a[j]);
		System.out.println();
		for(int i=0; i<a.length-1; i++) {
			a = new Sort().selectSort(a, i);
			System.out.printf("Sorted Data %d단계: ",i+1);
			for(int j=0; j<a.length; j++)
				System.out.printf("%d ",a[j]);
			System.out.println();
		}
	}

}
