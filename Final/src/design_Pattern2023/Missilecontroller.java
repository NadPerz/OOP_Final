package design_Pattern2023;

public class Missilecontroller {
	
	private static Missilecontroller controller;
	
	private Missileoperation operation1;
	private Missileoperation operation2;

	
	private Missilecontroller() {
		
	}
	
	public static Missilecontroller getInstance() {
		if(controller == null) {
			controller  = new Missilecontroller();
			System.out.println("Iniciate missile Controller");
		}
		return controller;
	}
	
	
	// aggeregation part 
	public void setOperation2(Missileoperation launch,Missileoperation blast ) {
		this.operation1 = launch;
		this.operation2 = blast;
 
	}
	
	
	
	public void  performLaunching(String  start) {
		operation1.initiateoperation(start);
	}
	
	public void performBlasting(String end) {
		operation2.initiateoperation(end);
	}
	
	



	
}
