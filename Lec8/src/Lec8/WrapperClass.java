package Lec8;

public class WrapperClass {

	public static void main(String[] args) {
		int res = 78;
		Integer myint;  // primitive data type
		
		
		//autoboxing***************
		
		//convert primitive data type to the wrapper class - autoboxing
		// convert int value to the wrapper class
		
		myint = res;  //autoboxing - convert primitive data type to its relevant wrapper class/ done automatically
		Integer res2 = myint.valueOf(res);  // another way / using method
		
		
		
		//unboxing*****************
		
		//convert wrapper clas to the primitive data type - unboxing
		
		
		Integer val = new Integer(45);
		int x = val;//assigning integer value to the int value / unboxing / done automaticaly
		int z = val.intValue();
		
		
		//wrapper class have many methods
		// example
		
		System.out.println(val.MAX_VALUE);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
