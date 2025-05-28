package Singleton;

public class Main extends Thread {

	public static void main(String[] args) {
//		Signleton obj1 =Signleton.getInstance();
//		Signleton obj2 = Signleton.getInstance(); 

	
		Main obj = new Main();
		obj.start();
		
		Signleton obj1 = Signleton.getInstance();
	}
	
	
	
		public void run() {
			Signleton.getInstance();
		}

		
		
/*		 
		if(obj1 == obj2) {
			System.out.println("Same Object");
		}

		obj1.hello();
	*/
	
	
}
