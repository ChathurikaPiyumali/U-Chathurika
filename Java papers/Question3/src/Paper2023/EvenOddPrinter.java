package Paper2023;


//runnable is a interface not a class
// so wee implements the runnable classes



public class EvenOddPrinter {
	
	private static final int MAX_NUM = 20;
	private static volatile int nextNum =1; //thrads use krl ek variable ekk access krnn on nn volatile variable ek dnw
	private static final Object lock = new Object();
	
	public static void main (String[] args) {
		
		Thread oddThread = new Thread(new OddRunnable(), "OddThread");
		Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
	
		oddThread.start();
		evenThread.start();
		
		try {
			oddThread.join();  //main thread wait until other interfaces run
			evenThread.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	
		
		
	}
		
	//run method ek runnable interface ekee thmi thynne
	static class OddRunnable implements Runnable{
	
		//runnable interface ekee methoda override krnn n one
		public void run() {
			while(nextNum <= MAX_NUM ) {
				synchronized (lock) {
					if(nextNum % 2 == 1) {
						System.out.println(Thread.currentThread().getName() + ":" + nextNum);
					nextNum++;
					lock.notify();
					}
					else {
						try {
						lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					}
					
					
				}
			}
		}	
	
	
	static class  EvenRunnable implements Runnable{
		
		//runnable interface ekee methoda override krnn n one
		public void run() {
			while(nextNum <= MAX_NUM ) {
				synchronized (lock) {
					if(nextNum % 2 == 0) {
						System.out.println(Thread.currentThread().getName() + ":" + nextNum);
					nextNum++;
					lock.notify();
					}
					else {
						try {
						lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					}
					
					
				}
			}
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

	
		
	
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	

