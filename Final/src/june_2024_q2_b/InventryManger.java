package june_2024_q2_b;

public class InventryManger {
	 public static void main(String[] args) {
		 GenericInventory obj1 = new GenericInventory();
		 GenericInventory obj2 = new GenericInventory();
		 
		 Integer[] inArr = {10,20,30,40};
		 Double obj1Avg = obj1.calculateAverage(inArr);
		 Double obj1min = obj1.calculateMinimum(inArr);
		 
		 
		 Double[] inArr2 = {10.5,20.5,30.5,40.5};
		 Double obj2Avg = obj2.calculateAverage(inArr2);
		 Double obj2min  = obj2.calculateMinimum(inArr2);

		 System.out.println("Avg is "+obj1Avg);
		 System.out.println("Min is "+obj1min);
		 
		 System.out.println("Avg is "+obj2Avg);
		 System.out.println("Min is "+obj2min);
		
	}
}
