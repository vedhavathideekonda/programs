package sample;

import java.util.Scanner;

public class BubbleSort {

	static void sort(int a[]) {
		int c,d,swap;
		for(c=0;c<(a.length-1);c++) {
			for(d=0;d<a.length-c-1;d++) {
				if(a[d]>a[d+1]) {
					swap=a[d];
					a[d]=a[d+1];
					a[d+1]=swap;
				}
			}
		}
	}
		public static void main(String[] args) {
			int a[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
			BubbleSort.sort(a);
          for(int c=0;c<a.length;c++) {
	System.out.println(a[c]);
}
	}

}
