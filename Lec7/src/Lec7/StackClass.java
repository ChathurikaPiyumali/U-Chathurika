package Lec7;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		//create string stack
		
		Stack<String> mystack = new Stack<>();
		mystack.add("Amal");
		mystack.add("Kamal");
		mystack.push("Nimal");  // add and push both doing same thing
		
		//display
		System.out.println(mystack);
		
		//remove - use .pop
		mystack.pop(); // remove the last value
		System.out.println(mystack);
		
		mystack.push("Saman");
		System.out.println(mystack);	
		
	}

}
