package Question4;

public class RocketMissileSystem implements MissileSystem {
	
	//create static reference object
	private static RocketMissileSystem rMissile;
	

	//create constructor private
	private  RocketMissileSystem() {
		
	}
	
	//create getInstance() Method - static
	public static RocketMissileSystem getInstance() {
		
		if(rMissile == null) {
			rMissile = new RocketMissileSystem();
			
			//see questions implementaions
			System.out.println("Initialize Rocket Missile System...");
		}
		
		return rMissile;
	}
	
	@Override
	public void launch(String source) {
		System.out.print("Rocket Missile launch from" + source);

	}

	@Override
	public void blast(String destination) {
		System.out.println("and Rocket Missile blast Flight " + destination);

	}

}
