//overriding occurs in inheritance

package Lec3;

class A{
	int a;
	int b;
	
	
}


class B extends A {
	int k;
	B(int a , int b , int c){
		super ();
		k=c;
		
	}
	
	void show( ) 
	{
		System.out.println("k:" + k);
	}
	
	
}





































