// ANOTHER METHOD TO INPUT DATA IN JAVA (without Scanner)
// package name is java.io

import java.io.*;

public class EX4{
	public static void main(String[] args)throws IOException{
		
		//initialize the variables
		int height,length,width,volume;
		//create an instance for InputStreamReader
		InputStreamReader isr = new InputStreamReader(System.in); // object of InputStreamReader
		BufferedReader br = new BufferedReader(isr); // object of BufferReader
		
		System.out.print("Enter the length of cube :" ); 
		length = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the width of cube :" ); 
		width = Integer.parseInt(br.readLine());
		
		System.out.print("Enter the height of cube :" ); 
		height = Integer.parseInt(br.readLine());
		
		volume = length* width* height;
		
		System.out.println("The volume of the cube is :" + volume);
		
		
	}
}