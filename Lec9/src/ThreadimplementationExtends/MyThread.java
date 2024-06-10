package ThreadimplementationExtends;

public class MyThread {
	public static void main(String args[]) {
		
		System.out.println("Hello world");
		childThread1 ob = new childThread1() ; // want to create object from the childthread1 class
		ob.start();  // start the child thread //to invork the run method want to start()	method
		
		//ob.run(); // this is not work
		
		
		for(int x=0;x<10;x++) {
			System.out.println("Hello world in Main thread" + x);
			
			//thread exception
			try {
				Thread.sleep(1000);  //after printing this out put this thread will be sleep  or post for this prticular ms
			}catch(InterruptedException e) {
				System.out.println("Exception Occured");
			}
			
			
		}
	}		

}
