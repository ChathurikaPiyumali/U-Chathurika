package Question4;

public class launchMissile implements MissileOperation {

	MissileSystem missile;
	
	public launchMissile(MissileSystem missile) {
		super();
		this.missile = missile;
	}

	@Override
	public void initiateOperation(String location) {
		missile.launch(location);

	}

}
