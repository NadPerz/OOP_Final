package design_Pattern2023;

public class LaunchMissile implements Missileoperation {

	Missilesystem missile;
	
	
 	public LaunchMissile(Missilesystem missile) {
		this.missile = missile;
	}


	@Override
	public void initiateoperation(String location) {
		missile.launch(location);
		
	}

}
