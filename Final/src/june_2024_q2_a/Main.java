package june_2024_q2_a;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Integer, Integer> product = new HashMap<>();
		
		 Scanner scanner = new Scanner(System.in);
		 
		 while(true) {
			 
			 System.out.println("Enter the product id");
			 int pid = scanner.nextInt();
			 
			 if(pid == -99) {
				 break;
			 }
			 
			 System.out.println("Enter the product quantity");
			 int qty = scanner.nextInt();
			 
			 product.put(pid, qty);
			 
		 }
		 
		 
		 
		 System.out.println("Enter product id u need to remove");
		 int rem = scanner.nextInt();
		 
		 
		 
		if (product.containsKey(rem)) {
			
			product.remove(rem);
			System.out.println("Product Sucessfully remove");
		}else{
			System.out.println("Product is not found");
		}
		 
		 
		 
		 System.out.println("Total number of product "+ product.size());
		 
		 System.out.println(product);
		 
		 
		 System.out.println("Product details");
		 
		 for(Integer i : product.keySet()) {
			 
			 System.out.println("Product id "+ i + "Quantity "+product.get(i));
		 }
		 
		 
		 
		 
		 
		 
		 
	}

	 

}
