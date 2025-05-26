package test0514;

import test0514.Sort;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {69, 10, 30, 2, 16, 8, 31, 22};
		
		System.out.printf("Input Data: ");
		for(int i = 0; i<a.length; i++)
			System.out.printf("%d ",a[i]);
		System.out.println();
		for(int i=1; i<a.length; i++) {
			System.out.printf("Sorted Data %d단계: ", i);
			System.out.println();
			for(int j=0; j<a.length-i; j++) {
				a = new Sort().selectSort(a, j);
			}
			System.out.println();
		}
	}

}
