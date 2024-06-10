import java.util.Scanner;

public class EX3{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double length,width,height,volume;
		
		System.out.print("Enter the length of cube :" ); // + length danna onee naa
		length = scn.nextDouble();
		
		System.out.print("Enter the width of cube :" );
		width = scn.nextDouble();
		
		System.out.print("Enter the height of cube :" );
		height = scn.nextDouble();
		//close
		scn.close();
		
		volume = length* width* height;
		
		System.out.println("The volume of the cube is :" + volume);
		
		
	}
}