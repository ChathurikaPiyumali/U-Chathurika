package lab4;

public class StudentApp {

	public static void main(String[] args) {
		
		//create an array  objects
		Student[] student = new Student[5];
		
		
		student[0] = new Student("Chathurika","It","071445445");
		student[1] = new Student("Nirmal","Maths","0114258967");
		student[2] = new Student("Chathura","Engineering","0745632985");
		student[3] = new Student("Piyumali","Management","0125698752");
		student[4] = new Student("Unagalle","Biology","025454879");
		
		//for each loop - these are used to iterate array easily
		
		for(Student Student : student) { //variable name //  // Array name
		
		Student.displayStudent();
		System.out.println( );
		}
		
		
		
		

	}

}
