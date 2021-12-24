package java11;
interface number{
	public double get(double d);
}
public class simpleintrest {

	public static void main(String[] args) {
		number principal=(d)->{
      return d;
	};
	System.out.println(principal.get(20000));
	
	number rate=(d)->{
	      return d;
		};
		System.out.println(rate.get(1));

		number time=(d)->{
		      return d;
			};
			System.out.println(time.get(10));
			
			;
			
			double interest=(principal.get(20000)*time.get(10)*rate.get(1))/100;
			System.out.println(interest);
			double amount = principal.get(2)+interest;
			System.out.println(amount);

}
}


