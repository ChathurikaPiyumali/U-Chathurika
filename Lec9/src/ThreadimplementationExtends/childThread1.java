package ThreadimplementationExtends;

public class childThread1 extends Thread{

	
	//want to display helloworld in 5 times 
	// so the method iss run()
	
	public void run() {
		
		for(int x=0;x<10;x++) {
			System.out.println("Hello world in child thread" + x);
			
			//thread exception
			try {
				Thread.sleep(3000);  //after printing this out put this thread will be sleep  or post for this prticular ms
			}catch(InterruptedException e) {
				System.out.println("Exception Occured");
			}
		}
	}
}
