package Lec2;

//base class

class Shape{
	
	//attributes
	protected String name;
	
	//methods
	public Shape()   // default constructor
	{
		
	}   
	public Shape(String tname)  // overloaded constructor
	{
		
	}
	
	public void print() {
		
	}
	
	public int area() {
		return 0;
	}
	
	
	
}


//child class
class Rectangle extends Shape{
	
	  
	
	protected int width;
	protected int height;
	
	public Rectangle(String tname,int w, int h) {
		super (tname); //super() is use inside  child class overloaded constructor 
		width=w;
		height = h;
	}
	
	public int area() {
		return 0;
	}
	
	
}




