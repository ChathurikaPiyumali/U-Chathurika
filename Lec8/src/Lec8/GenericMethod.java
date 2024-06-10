package Lec8;

public class GenericMethod {
	
	public static <E> void printArray(E[] element) {
		for(E ele : element) {
			System.out.print(ele);
		}
	}
	
	
	
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[]  doubleArray = {1.1,3.4,5.6};
		
		printArray(intArray);
		printArray(doubleArray);
	}
}
