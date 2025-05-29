package june_2024_q2_b;

public class GenericInventory  {
	
	 
	
	public <T extends Number> Double  calculateAverage(T[] numArr){
		double totol = 0;
		double count = 0;
		for(T element : numArr) {
			totol += element.doubleValue();
			count++;
		}
		
		double avg = totol/count;
		
		return avg;
//		System.out.println("Average of Array "+avg);
		
	}
	
	public <T extends Number> Double  calculateMinimum(T[] numArr){
		double min = 999900000.0;
		for(T element : numArr) {
			if(min > element.doubleValue()) {
				min = element.doubleValue();
			}
			
			
//			System.out.println("Minimum number of array "+ min);
		}
		return min;
		
		
	}
}
