package Lec3;

//mainly discuss about static objects

class Student{
	
	//attributes
	
	//private attributes
	private String ditno;
	private String name;
	private static String batchId; // static attributes
	
	//public attributes  : it can call in main method
	public int age; 
	public static int gpa; // static attributes : can call without object name but using class name
	
	
	//methods
		
	public Student (String mditno , String mname) {
		ditno = mditno;
		name = mname;
	}
	
	public void setBatchId(String mbatchId) //This is not a static method
	{
		batchId = mbatchId;
	}
	
	
	public static void setBatchId2(String mbatchId) //this is static method : they cannot refer to "this" or "super" anyway
	{
		batchId = mbatchId;
		Student.setBatchId2("Metro Y1B1"); //static methods can be called directly using the class name
		
		
	}
	
	public class Lec3{
	public static void main (String args[]) {
			
			//**********************************************************
			//for public attribute (without static)
			//create object
			Student s1 = new Student("it22555144" , "UCP Unagalle");
			
			//call public  attribute
			s1.age = 25;
			
			//***********************************************************
			//for public static attribute
			Student.gpa = 3; //can use the class name as the object name 
			
			//************************************************************
			//for methods : previous lecture type
			s1.setBatchId("Esoft 2022");
			
			//************************************************************
			//for static methods
			Student.setBatchId2("Sliit 2023");
			
		}
	}
}
