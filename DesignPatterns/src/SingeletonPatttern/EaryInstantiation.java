package SingeletonPatttern;

// EaryInstantiation {
	
	// Remeber below code
	
		public class Singleton {
			
			private static Singleton singleton = new Singleton();// static reference
			
			private Singleton() {} //constructor - private

			public static Singleton getInstance() {
				return singleton; //return object
				
			}
		}


