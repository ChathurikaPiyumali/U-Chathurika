package November2022A;

public class PermanentEmp extends Employee {
	
	private double basicSal;
	private double commision;
	
	//overloaded constructor
	
	public PermanentEmp( int id,String name,double basicSal) {
		super(id,name);
		this.basicSal = basicSal;
		this.commision= basicSal* 15/100;
	}
	
	  public double calculateNetSalary() {
		  return  basicSal + commision;
	}
	
	
	public void display() {
		super.display(); //Display id and name from Employee class
		System.out.println("Basic Salary : " + basicSal);
		System.out.println("Commission : " + commision);
		System.out.println("Net Salary :" + calculateNetSalary());
		
		
	}
	
}
 