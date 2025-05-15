package design_Pattern2023;

public class BlastMissile implements Missileoperation {

	Missilesystem missile;
	
	
	
	
	public BlastMissile(Missilesystem missile) {
		this.missile = missile;
	}




	@Override
	public void initiateoperation(String location) {

		missile.blast(location);
	}

}
