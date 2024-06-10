package ThreadSynchronization;

public class MyMain {

	public static void main(String[] args) {
		
	Screen screenob = new Screen();
	ChildThread t1 = new ChildThread(screenob,"Hello");
	ChildThread t2 = new ChildThread(screenob,"Welcom");
	
//**********************************************************************************
	// t1 creat screenob object
	//t2 creat screenob1 object
	
	//so t1 t2 create 2 different objects thats why they didnt synchronize
	
	//Screen screenob = new Screen();
	//Screen screenob1 = new Screen(); 
	//ChildThread t1 = new ChildThread(screenob,"Hello");
	//ChildThread t2 = new ChildThread(screenob1,"Welcom");
//*************************************************************************************
	
	}
	
	
	
}
