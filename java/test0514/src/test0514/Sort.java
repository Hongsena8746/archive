package test0514;

public class Sort {
	public int[] selectSort(int a[],int n) {
		int num=0;
		
		if(a[n]>a[n+1]) {
			num = a[n+1];
			a[n+1] = a[n];
			a[n] = num;
		}
		
		for(int i = 0; i<a.length; i++)
			System.out.printf("%d ",a[i]);
			
		System.out.println();
		return a;
	}
}
