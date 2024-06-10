package Question4;

public class BlastMissile implements MissileOperation {

	//store missile type using constructor
	MissileSystem missile;

	public BlastMissile(MissileSystem missile) {
		super();
		this.missile = missile;
	}




	@Override
	public void initiateOperation(String location) {
		missile.blast(location);

	}

}
