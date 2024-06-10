import java.util.Scanner;

public class input{
	
	public static void main(String args[]) {
		
		String name;
		int age;
		float salary;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = scn.next();
		
		System.out.println("Enter your age : ");
		age = scn.nextInt();
		
		System.out.println("Enter your salary : ");
		salary = scn.nextFloat();
		
		scn.close();
		
		
		
	}
}