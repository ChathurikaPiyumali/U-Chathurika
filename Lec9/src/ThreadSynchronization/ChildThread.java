package ThreadSynchronization;

public class ChildThread extends Thread{
	Screen obj;
	String msg;
	
	public ChildThread(Screen obj,String msg) {
		super();
		this.obj = obj;
		this.msg = msg;
		start();
	}
	
	public void run() {
		obj = new Screen(); // make different object - not happen synchronization
		obj.Display(msg);
	}
	
	
}
