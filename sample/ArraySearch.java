package sample;

public class ArraySearch {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
		int find=19;
		boolean found = false;
		for(int n : a) {
			if(n == find) {
				found = true;
				break;
			}
		}
if (found)
	System.out.println(find+" is found");
else
	System.out.println(find+" is not found");
	}

}
