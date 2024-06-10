package November2022;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//object kiynne hama clas ekkm parent class ek
		
		Object lock = new Object(); //Synchronization lock **********************

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Pattern 1 = ");
		String p1 = scn.next();
		
		System.out.print("Enter Pattern 2 = ");
		String p2 = scn.next();
		
		System.out.print("Enter Count = ");
		int count = scn.nextInt();
		
		//create thread objects
		
		Thread thread01 = new Pattern01(lock,p1,count);
		Thread thread02 = new Pattern02(lock,p2,count);
		
		//run thread object
		
		thread01.start();
		thread02.start();
		
		//use thread join method
		
		// 1 ek run wel iwr wenkn main ek inn
		//try catch ekkuth denn ona
		
		try {
			thread01.join();
			thread02.join(); //thread2 ekth ekm krnn ona
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
