//ListInterface - duplicate value can be stored

package Lec7;

import java.util.ArrayList;                                                

public class ListInterface {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		// ArrayList can have any no of elements
		// We are not giving the size
		
		arrayList.add(100);
		arrayList.add(400);
		arrayList.add(500);
		
		//display the ArrayList
		System.out.println("Content of the array" + arrayList);
		
		//size of the array
		System.out.println("Size of the array " + arrayList.size());
		
		//insert element
		arrayList.add(1,1000); // add 1000 value to the position 1
		
		System.out.println("Content of the array" + arrayList); // [100,1000,400,500]
		System.out.println("Size of the array " + arrayList.size());
		
		//remove element
		arrayList.remove(3); // remove the 3rd position
		System.out.println("Content of the array" + arrayList);
		System.out.println("Size of the array " + arrayList.size());
		
		arrayList.add(1070); // add to last
		System.out.println("Content of the array" + arrayList);
		System.out.println("Size of the array " + arrayList.size());
		
		
		
		// another way to display array list
		
		//forEach loop for iterating  over collections
		
		for (Integer a : arrayList)  // declare the variable //this for loop does not having the increments 
		{
			System.out.println( a);
		}    
		
		
		//***********************************************************//
		
		// convert ArrayList to array
		
		Integer arr[] = new Integer[arrayList.size()];
		arr = arrayList.toArray(arr);
		for(int x=0; x<arr.length; x++) {
			System.out.println("Element" + (x+1) + "=" + arr[x]);
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
