package ImplementRunnableInterface;
//when use runnable interface
//when implement the runnable interface cannot creat objects in common way.
//always want to creat object in thread class
//pass runnable target
//see line 29 to 31

	public class commanThread extends Thread{

		
			public static void main(String args[]) {  	

				System.out.println("Hello world");
				
				commanThread ob = new commanThread() ;  
				ob.start(); //invoke the particular run method
				
				commanThread ob1 = new commanThread() ;
				ob1.start();
				
				
				
				
				//when implement the runnable interface cannot creat objects in common way.
				//childThread2 ob3= new childThread2() ;
				//ob3.start();
				
				
				childThread2 ob3= new childThread2() ;
				Thread ob4 = new Thread(ob3);
				ob4.start();
				
				//can do it one line
				Thread ob8 = new Thread(new childThread2());
				
				
				
				
				
				
				
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
				
				
				//because the created  runnable clz object create is different 
				//childThread2 ob5 = new childThread2();
				//Thread ob6 = new Thread(ob5);  //runnable clz object is ob5
				//ob6.start();
				
				Thread ob6 = new Thread(new childThread2());
				
				
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


