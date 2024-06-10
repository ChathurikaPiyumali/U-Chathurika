package Question4;

public class HeatMissileSystem implements MissileSystem {

	//create static reference object
		private static HeatMissileSystem hMissile;
		

		//create constructor private
		private  HeatMissileSystem() {
			
		}
		
		//create getInstance() Method - static
		public static HeatMissileSystem getInstance() {
			
			if(hMissile == null) {
				hMissile = new HeatMissileSystem();
				
				//see questions implementaions
				System.out.println("Initialize Heat Missile System...");
			}
			
			return hMissile;
		}
		
		@Override
		public void launch(String source) {
			System.out.print("Heat Missile launch from" + source);

		}

		@Override
		public void blast(String destination) {
			System.out.println("and Heat Missile blast Flight " + destination);

		}

	}



