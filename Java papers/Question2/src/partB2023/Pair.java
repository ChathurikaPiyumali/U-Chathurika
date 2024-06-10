package partB2023;


//create generic class
public class Pair<T,U> {
	T First;
	U Second;
	
	//overloaded constructor
	public Pair(T num1, U num2) {
		super();
		this.First= num1;
		this.Second = num2;
	}

	public T getFirst() {
		return First;
	}

	public U getSecond() {
		return Second;
	}
	
	
	
	
	
	
	
}
