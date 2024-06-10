package ThreadimplementationExtends;

public class commanThread extends Thread{

//main method
	public static void main(String args[]) {  	//main thread - main threa run automatically

		System.out.println("Hello world");
		
		commanThread ob = new commanThread() ;  //child thread1 object - call the start method
		ob.start(); //invoke the particular run method
		
		commanThread ob1 = new commanThread() ;
		ob1.start();
		
		childThread2 ob3= new childThread2() ;
		ob3.start();
		
		commanThread ob2 = new commanThread() ;	//child thread2 object - its not running currently
		
		
		for(int x=0;x<10;x++) {
			System.out.println("Hello world in Main thread" + x);

			//thread exception
			try {
				Thread.sleep(1000);  
			}catch(InterruptedException e) {
				System.out.println("Exception Occured");
			}


		}
	}		

	//child thread
	public void run() {
		for(int x=0;x<10;x++) {
			System.out.println("Hello world in first child thread" + x);

			//thread exception
			try {
				Thread.sleep(1000);  
			}catch(InterruptedException e) {
				System.out.println("Exception Occured");
			}
		}
	}











}
