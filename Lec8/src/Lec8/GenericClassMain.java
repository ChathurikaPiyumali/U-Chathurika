package Lec8;
import java.util.ArrayList;
public class GenericClassMain {
	public static void main(String[] args) {
		MyGen<Integer> m = new MyGen<>();
		m.add(12);
		System.out.println("" + m.get());
	}

}
