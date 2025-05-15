package design_Pattern2023;

public class Test {
  
	public static void main(String[] args) {

//		this is the way object ceate in sigleton
		HeatMissilesystem heatmissile = HeatMissilesystem.getInstance();
		RocketMissilesystem rocketmissile = RocketMissilesystem.getInstance();
		
		Missilecontroller cont = Missilecontroller.getInstance();
		
		cont.setOperation2(new LaunchMissile(heatmissile),new BlastMissile(heatmissile));
		cont.performLaunching("Colombo");
		cont.performBlasting("MH370");
		
		cont.setOperation2(new LaunchMissile(rocketmissile),new BlastMissile(rocketmissile));
		cont.performLaunching("Kandy");
		cont.performBlasting("MH420");
	}

}
