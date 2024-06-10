//Static variables  ,   final properties
 
//final int FILE_NEW = 1;



package Lec3;

class StaticDemo {
	static int a=3;
	static int b;
	
	static void meth(int x) {
		System.out.println("x = " + x);
	}
	
	static {
		System.out.println("Static block initialized");
		b = a*4;
	}
	

	
	
	public static void main (String args[]) {
		meth(42);
	}
	
}
	
	
	

	
	




