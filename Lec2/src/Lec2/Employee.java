package Lec2;

class Employee{
	private int empNo;
	private String name;
	private double basicSalary;
	private int otHrs;
	private int otRate;
	private double allowance;
	private double salary;
	
	
	
	//default constructor
	
	public Employee() {
		empNo = 0;
		name = "";
		basicSalary = 0;
		
		
	}
	
	
	//overloaded constructor
	
	public  Employee(int eempNo,String ename,double ebasicSalary) {
		empNo = eempNo;
		
		this.name = ename;  // we use .this  for if parameter name & assign name same only (name = name) --->  this.name = name
		
		basicSalary = ebasicSalary;
		
	}
	
	
	
	public void setOtDetails() {
		
	}
	
	public void setAllowance() {
		
	}
	
	public double calcSalary() {
		double salary = basicSalary + otHrs + otRate;
		return salary;
	}
	
	public void printPaySlip() {
		
	}
	
	
	public class Employeee{
		
		public static void main (String args[]) {
			
			//create objects
			
			Employee emp1 = new Employee();
			Employee emp2 = new Employee();	
			
		}
	}
	
}






