package Singleton;

public class Signleton {
 
//	2) create object / unique instance for sigleton clz
	public static Signleton uniq;
	
	// if its private cant create in main clz, object only create inside of the siglton class
//	1) make constructor private 
	private Signleton() {
		 System.out.println("object created");
	}
	
	
//	3) create get instance method 
	public static Signleton getInstance() {
		if(uniq == null) {
			synchronized (Signleton.class) { //double lock when thread safty for sigleton
				if(uniq == null) {
					uniq = new Signleton();
				}
			}
			
		}
		
		return uniq;
	}
	
	
	
	
	public void hello() {
		System.out.println("Hello From Siglton ");
	}

}
