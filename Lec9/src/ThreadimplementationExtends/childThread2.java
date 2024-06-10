package ThreadimplementationExtends;

public class childThread2 extends Thread{
	
	public void run() {
		for(int x=0;x<5;x++) {
			System.out.println("Hello world in second child thread" + x);

			//thread exception
			try {
				Thread.sleep(1000);  
			}catch(InterruptedException e) {
				System.out.println("Exception Occured");
			}
	}
}

}