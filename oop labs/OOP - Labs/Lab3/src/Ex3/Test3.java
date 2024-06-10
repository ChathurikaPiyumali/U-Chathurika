package Ex3;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//overloaded constructors
		//create objects
		
		Student3 s1 = new Student3();
		s1.setName("Unagalle");
		s1.setDitNo("IT66");
		s1.setAddress("Malabe");
		
		Student3 s2 = new Student3();
		s2.setName("nirmal");
		s2.setDitNo("It223");
		s2.setAddress("Nugegoda");
		
		
		
		
	
		
		//output objects
		System.out.println("Name :" + s1.getName() + "\nDit No :" + s1.getDitNo() + "\nAddress :" + s1.getAddress());
		System.out.println("Name :" + s2.getName() + "\nDit No :" + s2.getDitNo() + "\nAddress :" + s2.getAddress());
	}

}
