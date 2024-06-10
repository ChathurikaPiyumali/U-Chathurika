package Question4;

public class Test {

	public static void main(String[] args) {
		
		//objects hdn widih wens bl gnn
		
		HeatMissileSystem heatmissile = HeatMissileSystem.getInstance();
		RocketMissileSystem rocketmissile = RocketMissileSystem.getInstance();
		
		MissileController cont = MissileController.getInstance();
		
		cont.setOperations(new launchMissile(heatmissile) , new BlastMissile(heatmissile));
		cont.perfomeLaunching("Colombo");
		cont.perfomeLaunching("MH370");
		
		
		cont.setOperations(new launchMissile(rocketmissile) , new BlastMissile(rocketmissile));
		cont.perfomeLaunching("Colombo");
		cont.perfomeLaunching("MH370");
		
		
		
		
		
	}

}
