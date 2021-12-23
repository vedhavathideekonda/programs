package vehicle;
//ABSTRACT CLASS
public abstract class Vehicle {
	//ABSTRACT METHOD
	abstract void name();
	//NON ABSTRACT METHOD
	int milage(int a) {
	return a;
		
	}
}
	class car extends Vehicle{
		//method overriding
	void name() {
		System.out.println("car name: ford");
	}
	}
	
	class bike extends Vehicle{
		//method overriding
		void name() {
			System.out.println("bike name: yamaha");
		}
	}
	
	

