package final_2023or21_q3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList <Integer> intList = new  ArrayList<>();
		
		System.out.println("Input the Number");
		
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
	
		while(num != 0) {
		
			intList.add(num);
			
			System.out.println("Input the Number");
			num  = obj.nextInt();
		}
		
//		int length = intList.size();
		 
		intList.removeIf(n -> n % 2 == 1);
		
		
//			for (int i = 0; i < intList.size(); i++) {
//				
//				if( intList.get(i) % 2 == 1) {
//					intList.remove(i);
//					
//				}	 
//		}
			
		System.out.println(intList);
		
		
	}
	
}
