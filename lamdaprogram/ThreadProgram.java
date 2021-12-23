package lamdaprogram;

public class ThreadProgram {
	
int counter =1;
static int n=10;
public void oddnumber() {
	synchronized(this)
	{
		while(counter<n) {
			while(counter%2==0) {
				try {
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
		System.out.print(counter+" ");
		counter++;
		notify();  //notify to thread
	}
		}
}

 public void evennumber() {
	synchronized(this)
	{
		while(counter<n) {
			while(counter%2==1) {
				try {
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		System.out.print(counter+" ");
		counter++;
		notify();//notify to 2nd thread
	}}
}
public static void main(String[] args) {
	
	ThreadProgram tp = new ThreadProgram();
	
	
	Thread t1 = new Thread(new Runnable()
			{
		public void run()
		{
			tp.evennumber();
		}
			});

	
	
	Thread t2 = new Thread(new Runnable()
	{
public void run()
{
	tp.oddnumber();
}
	});
	
	
	t1.start();
	
	t2.start();	
}
}
