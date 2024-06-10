package November2022A;

abstract public class Employee {
	private int id;
	private String name;
	
	//overloaded constructor
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	//abstract method
	abstract public double calculateNetSalary();
	
	public void display() {
		System.out.println("Employee ID:" + id);
		System.out.println("Employee Name:" + name);
	}
	
}
