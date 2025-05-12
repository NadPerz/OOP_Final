package thread_2022;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws InterruptedException {

		
//		Object mean parent clz of all clz
		
		Object  lock = new Object(); //synchronize lock
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Pattern 1");
		String p1 = scanner.nextLine();
		
		System.out.println("Enter Pattern 2");
		String p2 = scanner.nextLine();
		
		System.out.println("Enter Count");
		int count = scanner.nextInt();
		
		Thread thread01 = new Pattern1(lock, p1, count);
		Thread thread02 = new Pattern2(lock, p2, count);

		thread01.start();
		thread02.start();
		
		
		thread01.join();
		thread02.join();
	}

}
