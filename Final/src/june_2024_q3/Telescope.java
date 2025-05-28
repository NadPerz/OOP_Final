package june_2024_q3;

public class Telescope extends Thread {

	
	private Object lock;

	
	
	public Telescope(Object lock) {

		this.lock = lock;
	}

	


	public Telescope() {
		this.lock = null;
	}




	@Override
	public void run() {
		 
		
			if (lock != null) {
				synchronized (lock) {
					for (int i = 0; i < 5; i++) {
						System.out.println("Telescope is observing");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}

					}

					System.out.println(" ");

					lock.notify();

					try {
						lock.wait(5);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				} 
			}else {
				for (int i = 0; i < 5; i++) {
					System.out.println("Telescope is observing");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					
				}
			}
	}
}
