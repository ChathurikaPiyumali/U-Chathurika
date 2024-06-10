package November2022;

//Thread kiyana lass ekee child thread class ekk  thmi Pattern01


public class Pattern01 extends Thread{
	private Object lock; //for synchronization
	private String pattern;
	private int count;
	
	//constructor
	public Pattern01(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}
	
	//override the run() method and implement the pattern print logic
	
	
	//Thread clz ekee method ekk thmii mee run kiynne
	//The run method inherits from Runnable interface to Thread class
	
	//pattern01 kiyn thread ek run kalaama run wenne mee phala run method ek athule thyn tika
	
	public void run() {
		
		synchronized (lock) {  // me loop ek run wel iwr krnw mulinm
			
			//Implement the star pattern
			
			for(int i=0; i < count ; i ++ ) {
				System.out.print("Pattern 01 Thread = ");
				for(int j = 0; j< count-1 ; j++) {
					System.out.print("");
				}
				
				for(int j = 0 ; j < i+1 ; j++) {
					System.out.println(pattern + "");
				}
				
				//for pattrn 1 and pattern 2 space gap
				System.out.println();
				
				
				//Thread kiyana class ekee method ekk mee sleep kiynne, time eka ms denn onee
				//try catch ek dnn klin en error line ek click klm auto create wenw try catch block ekm
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				
				//notify - pattern 01 ge idn pattern 2 ta lock ek denn ona
				
				lock.notify();
				
				
				try {
					lock.wait();  //try catch block ekk onaa
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				} 
		
			}
			
	
		}
		
		
	}	
	
}
