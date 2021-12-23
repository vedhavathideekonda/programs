package sample;

public class ArmstrongNumbers {

	public static void main(String[] args) {
	for(int k=100;k<=1000;k++) {
		int n = k;
		int remainder = 0;
		int result = 0;
		while(n>0) {
			remainder = n%10;
			result = result+(remainder*remainder*remainder);
			n=n/10;
			
		}
		if(k==result) {
			System.out.println(k+"is an armstrong number");
		}
	}

	}

}
