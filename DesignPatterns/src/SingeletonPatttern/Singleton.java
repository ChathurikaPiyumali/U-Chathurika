package SingeletonPatttern;

//early
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}

	public static Singleton getInstance() {
		return singleton;
		
	}
}


//Lazy

public class Singleton{
	
	private static Singleton singleton;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(singleton == null) {
			singleton = new Singleton();
			System.out.println("Singleton invocation");
		}
		
		return singleton;
		
	}
}




















