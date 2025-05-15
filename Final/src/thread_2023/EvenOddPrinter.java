package thread_2023;

public class EvenOddPrinter {
	private static final int MAX_NUM = 20;
	private static volatile int nextNum = 1; //thread safe
	private static final Object lock = new Object();//key use syncrhonized
		
	
	public static void main(String[] args) throws InterruptedException {
		Thread evenThread =new Thread(new EvenRunnable(), "EvenThread");  
		Thread oddThread = new Thread(new OddRunnable(), "OddThread");
		
		evenThread.start();
		oddThread.start();
		
		
		evenThread.join();
		oddThread.join();
		
	}

	
	public static class EvenRunnable implements Runnable  {

		
		
		 
		public void run() {
			while(nextNum <=MAX_NUM) {
				synchronized (lock) {
					if(nextNum %2 == 1) {
						System.out.println(Thread.currentThread().getName()+":"+ nextNum);
						nextNum++;
						lock.notify();
						
					}else {
						try {
							
							lock.wait();
						} catch (InterruptedException e) {
 
							e.printStackTrace();
						}
					}
				}
			}
			
		}

	}
	
	
	public static class OddRunnable implements Runnable {

		 
		public void run() {
			while(nextNum <=MAX_NUM) {
				synchronized (lock) {
					if(nextNum %2 == 0) {
						System.out.println(Thread.currentThread().getName()+":"+ nextNum);
						nextNum++;
						lock.notify();
						
					}else {
						try {
							
							lock.wait();
						} catch (InterruptedException e) {
 
							e.printStackTrace();
						}
					}
				}
			}
		}

	}
}
