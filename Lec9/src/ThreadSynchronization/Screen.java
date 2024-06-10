package ThreadSynchronization;


//can synchronize entire method
//can synchronize entire block


//method synchronize   - multiple threads accsess to the same objects
//			 problem   - 
public class Screen {
	
	public synchronized void Display(String msg) {
		synchronized (msg){
			
		
		System.out.println("[" +msg);
		
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("]");
	}
	
	}
}
