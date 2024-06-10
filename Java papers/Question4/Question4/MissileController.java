package Question4;

//set two operations called launch and blast  - for the command pattern

public class MissileController {
	
	//create static instance object
	private static MissileController controller;
	
	//implement controller
	//for command pattern -> (Invoker-MissileController
	private MissileOperation operation1;  //for launch command
	private MissileOperation operation2; //for blast command
	
	
	
	
	//constructor
	private MissileController() {
		
	}
	
	public static MissileController getInstance(){
		
		if(controller == null) {
			controller = new MissileController();
		}
		
		
		return controller;
	}
	
	
	//set two commands to the invoker
	//can put any function name
	
	
	//remote ek
	public void setOperations(MissileOperation launch , MissileOperation blast) {
		this.operation1 = launch;
		this.operation2 = blast;
	}
	
	
	//command ek denw ptn gnn kiyla
	public void perfomeLaunching(String start) {
		operation1.initiateOperation(start);
	}
	
	
	public void performBlasting(String end) {
		operation2.initiateOperation(end);
	}
}
