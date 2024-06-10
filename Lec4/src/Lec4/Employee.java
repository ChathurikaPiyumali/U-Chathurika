package Lec4;

public class Employee implements Printable {
	
	private int empId;
	private String empName;
	
	public Employee(int eId, String eName) {
		empId = eId;
		empName = eName;
	}
	
	public void print() {
		System.out.println("employee id :" + empId +"  \n employee Name : " +empName);
	}

}
