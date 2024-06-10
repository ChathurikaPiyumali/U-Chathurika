package YeildMethod;

public class ThreadYield extends Thread{

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Started executing" + t.getName());
		
		for (int i = 0; i< 10; i++) {
			System.out.println(t.getName());
		}
		
		System.out.println("Finished executing" + t.getName());
	}
	
	public static void main(String args[]) throws Exception{
		
		//Thread t = new  Thread(new ThreadYeild(), "New Thread");
		//t.start();
		System.out.println("Started executing main thread " );
		//t.yield();
		
		for (int i=0;i< 10; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		System.out.println("Finished executing" + Thread.currentThread().getName());
			
		}
	}
	
	
	

