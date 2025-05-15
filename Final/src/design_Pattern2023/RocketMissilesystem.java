package design_Pattern2023;

public class RocketMissilesystem implements Missilesystem {
	
	private static RocketMissilesystem rMissile;
	
	private RocketMissilesystem() {
		super();
	}
	
	public static RocketMissilesystem getInstance () {
		
		if(rMissile == null) {
			
			rMissile   = new RocketMissilesystem();
			System.out.println("Initialize Rocket Missile System...");
		}
		
		
		return rMissile;
	}
	
	
	@Override
	public void launch(String source) {
		
		System.out.print("Rocket missile launch from"+ source );
	}

	@Override
	public void blast(String destination) {
		System.out.println(" and Rocket missile blast Flight "+ destination);
		
	}

}
