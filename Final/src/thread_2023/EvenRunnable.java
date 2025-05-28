package thread_2023;
 	
	public class EvenRunnable implements Runnable  {

		
		
		 
		public void run() {
			while(EvenOddPrinter.nextNum <=EvenOddPrinter.MAX_NUM) {
				synchronized (EvenOddPrinter.lock) {
					if(EvenOddPrinter.nextNum %2 == 0) {
						System.out.println(Thread.currentThread().getName()+":"+ EvenOddPrinter.nextNum);
						EvenOddPrinter.nextNum++;
						EvenOddPrinter.lock.notify();
						
					}else {
						try {
							
							EvenOddPrinter.lock.wait();
						} catch (InterruptedException e) {
 
							e.printStackTrace();
						}
					}
				}
			}
			
		}

	}

 
