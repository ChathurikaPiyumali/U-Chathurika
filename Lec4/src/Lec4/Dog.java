package Lec4;

/*
abstract public class Dog extends Animal { 
	
	abstract public void makeSound();
}
*/

// how can we call the getters above methods?
//solution is the following way



public class Dog extends Animal { 
	
	public void makeSound() {
		System.out.println("Woof Woof");
	}

}

//each child class must override all the abstract methods of parents
//but how can we call the non abstracts methods if the child clas should abstract?
//the solution is we can implement the parent abstracts methods in child class like above way
