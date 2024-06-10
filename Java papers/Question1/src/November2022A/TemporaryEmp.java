package November2022A;

public class TemporaryEmp extends Employee{
	private int OtHrs;
	private double OtRate;
	private double minWage;
	
	//overloaded
	
	public TemporaryEmp(int id,String name,int OtHrs,double OtRate) {
		super(id,name);
		this.OtHrs = OtHrs;
		this.minWage = 15000; //minimum wage is 15,000
	}
	
	public double calculateNetSalary() {
		double OtAmount =( OtHrs *OtRate);
		return minWage + OtAmount;
	}
	
	public void display() {
		super.display();
		System.out.println("Minium Wage :" + minWage);
		System.out.println("Net Salary : " +calculateNetSalary());
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
