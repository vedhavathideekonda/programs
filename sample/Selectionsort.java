package sample;

public class Selectionsort {
	private static int[] a;
	static void sort(int []a) {
		int d,swap;
		for(int i=0;1<(a.length-1);i++) {
			int min_idx=i;
			for(int j=i+1;j<a.length;j++) {
			if	(a[j+1]<a[min_idx]) {
				min_idx=j;
			}
			
			}	
			swap=a[min_idx];
			a[min_idx]=a[i];
			a[i]=swap;
			
		}}
	public static void main(String[] args) {
		Selectionsort.sort(a);
		for(int d:a) {
			System.out.println(d+"");

	}
	}
}
