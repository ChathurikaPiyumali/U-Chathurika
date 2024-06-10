package Lec8;

public class GenericClass <T> {
	T obj;
	
	void add(T val) {
		this.obj = val;
	}
	
	T get() {
		return obj;
	}

}
