package Ex2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//overloaded constructors
		//create objects
		
		Student2 s1 = new Student2("Unagalle" , "IT222", "Malabe");
		Student2 s2 = new Student2("Nirmal" , "IT223", "Nugegoda");
		
	
		
		//call objects
		System.out.println("Name :" + s1.name + "\nDit No :" + s1.ditNo + "\nAddress :" + s1.address);
		System.out.println("Name :" + s2.name + "\nDit No :" + s2.ditNo + "\nAddress :" + s2.address);
	}

}
