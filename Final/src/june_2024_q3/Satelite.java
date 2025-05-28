package june_2024_q3;

public class Satelite extends Thread {

	private Object lock;
	
	
	
	
	public Satelite(Object lock) {
		this.lock = lock;
	}
	

	public Satelite() {
		this.lock = null;
	}



	@Override
	public void run() {
		
		
		 
			if (lock != null) {
				synchronized (lock) {
					
				
				
					
					for (int i = 0; i < 5; i++) {
						System.out.println("Satelite is observing");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}

					}
					lock.notify();
					
					try {
						
						lock.wait(5);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
 
				} 
			}else {
				for (int i = 0; i < 5; i++) {
					System.out.println("Satelite is observing");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					 
				}
				
			}
	}
}
