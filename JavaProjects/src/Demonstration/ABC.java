package Demonstration;

public class ABC implements Runnable {
	
	public void run()
	{
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("The state of thread1 while it invoked the method join on thread t2 -"+ThreadState.t1.getState());
		
		try
		{
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
