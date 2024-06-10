package lec6;

public class Exercise2 {
	public static void main (String args[]) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		String s5=s4;
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Java"));
		System.out.println(s3.equals(s4));
		System.out.println(s5.equals(s4));
		System.out.println(s5==s4);
		
		
		
		
	}
}
