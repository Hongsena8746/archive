package test0513;

public class Sort {
	public int[] selectSort(int a[],int n) {
		int min=a[n];
		int num=n;
		for(int i=n;i<a.length;i++) {
			if(min>a[i]) {
				min = a[i];
				num = i;
			}
		}
		a[num] = a[n];
		a[n] = min;
		 
		return a;
	}
}
