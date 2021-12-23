package lamdaprogram;

public class Basic {
	public static void main(String[] args) {
		Thread t=new Thread(() -> run());
t.start();
	}
			public static void run() {
			for(int i =1;1<=5;i++) {
				System.out.println(Thread.currentThread().getName()+",i="+i);
			}
			}
}
		
	
	

