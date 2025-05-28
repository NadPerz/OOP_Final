package june_2024_q3;

public class ObservationControler {
	
//	public static final int lock = NULL
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.out.println("Starting synchronized observations:");
	    System.out.println(" ");
		Object lock = new Object();
		
		Telescope t1 = new Telescope(lock);
		Satelite s1 = new Satelite(lock);
		
		t1.start();
		s1.start();
		
		t1.join();
		s1.join();
		
		System.out.println(" ");
        System.out.println("\nBoth observations begin again simultaneously:");
        System.out.println(" ");
		
		Telescope t2 = new Telescope();
		Satelite s2 = new Satelite();
		
		t2.start();
		s2.start();
		
		t2.join();
		s2.join();
	}
	
}
