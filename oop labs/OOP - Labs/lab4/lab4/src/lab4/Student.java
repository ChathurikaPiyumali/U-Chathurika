package lab4;

public class Student {
	private int studentID;
	private String name;
	private String degree;
	private String mobile;
	
	private static int max = 100;
	
	//default constructor

	public Student() {
		
	} 
	
	//overloaded constructor
	
	public Student( String Name, String Degree , String Mobile) {
		this.name = Name;       //  "this"  keyword called the private class name
 		this.degree = Degree;
		this.mobile = Mobile;
		
	
	}
	
	public static int getstudentID() {
		return max++;
	}

	
	//Create setters and getters for name, degree and mobile
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	//Create a print() method to print details of a student
	public void displayStudent() { 
		System.out.println("Student name :" + getName());
		System.out.println("Student ID :" + getstudentID());
		System.out.println("Student Degree :" + getDegree());
		System.out.println("Student Mpbile :" + getMobile());
		
	}
	
	//Create a static method called getNextStudentID() to return the next studentID
	public static int getNextStudentID() {
		return max;
	}
	
	
	
	
	
	
	
	
	
}
