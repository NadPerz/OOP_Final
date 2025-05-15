package design_Pattern2023;

public class HeatMissilesystem implements Missilesystem {
 
	private static HeatMissilesystem hMissile;
	
	private HeatMissilesystem() {
		super();
	}
	
	public static HeatMissilesystem getInstance () {
		
		if(hMissile == null) {
			
			hMissile   = new HeatMissilesystem();
			System.out.println("Initialize Heat Missile System...");
		}
		
		
		return hMissile;
	}
	
	@Override
	public void launch(String source) {

		System.out.print("Heat missile launch from "+source);
	}

	@Override 
	public void blast(String destination) {

		System.out.println(" and Heat missile blast Flight "+ destination);
	}

}
