public class Demo{
	public static void main (String args[]){
		EvenOddNumber num = new EvenOddnumber();
		
		boolean result = num.findEvenOrOdd(7);
		
		if (result == true){
			System.out.print("This is an even number");
		}
		
		else{
			System.out.print("Ths is an odd number");
		}
	}
}