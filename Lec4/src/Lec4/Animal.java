package Lec4;

abstract public class Animal {
	
	// 1. abstracts method do not have  main body
	// 2. abstract methods can not be called
	
	 public void eat() {
		 System.out.println("I am eating");
	}

	abstract public void makeSound();  //abstract method

}

// 3. if u have at least one abstract method , then the class should define as abstract classs
// abstract class can not create objects






