package November2022;


public class Pattern02 extends Thread{
	private Object lock;
	private String pattern;
	private int count;


	public Pattern02(Object lock, String pattern, int count) {
		super();
		this.lock = lock;
		this.pattern = pattern;
		this.count = count;
	}



	public void run() {

		synchronized (lock) {  

			//Implement the star pattern

			for(int i=0; i < count ; i ++ ) {
				System.out.print("Pattern 02 Thread = ");
				for(int j = 0; j< count-i ; j++) {
					System.out.print("");
				}
				for(int j = 0 ; j < i+1 ; j++) {
					System.out.println(pattern + "");
				}
				System.out.println();



				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

			lock.notify();  // lock ek 2 idn 1 t denn onee


			try {
				lock.wait();  //try catch block ekk onaa
			} catch (InterruptedException e) {

				e.printStackTrace();
			} 



		}


	}





}


