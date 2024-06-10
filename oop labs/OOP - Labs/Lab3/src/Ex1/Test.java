package Ex1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defaut constructor
		Student s1= new Student();
		s1.name ="Unagalle";
		s1.ditNo = "IT22555";
		s1.address = "Malabe";
		
		Student s2 = new Student();
		s2.name = "Nirma";
		s2.ditNo = "It443";
		s2.address = "Nugegoda";
		
		System.out.println("Name: "+ s1.name + "\nDIT no :" + s1.ditNo + "\nAddress : " + s1.address);
		System.out.println("Name: "+ s2.name + "\nDIT no :" + s2.ditNo + "\nAddress : " + s2.address);
	}

}
