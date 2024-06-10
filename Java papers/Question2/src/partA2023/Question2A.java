package partA2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2A {

	public static void main(String [] args) {
		ArrayList<Integer> number = new ArrayList<>();

		Scanner scn = new Scanner(System.in);

		int num;

		System.out.println("Enter numbers (0 to quit) : ");
		// new point


		while(true) {
			num= scn.nextInt();
			if(num == 0) {
				break;
			}

			number.add(num);
			
		}//scn.close();


		for(int i=0; i<number.size(); i++) {

			if(number.get(i) % 2 == 0) {
				number.remove(i);
				i--;
			}

			System.out.println("Odd number:" + number);

		}


	}


}