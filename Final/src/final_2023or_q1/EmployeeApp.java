package final_2023or_q1;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {

		ArrayList <Employee> e1 = new ArrayList<>();
		ArrayList <Manager> m1   = new ArrayList<>();

		Employee obj1 = new Employee();
		obj1.Read("i2930", "Nads", "huston");
		
		Employee obj2 = new Employee();
		obj1.Read("i2930", "Nassds", "address2");
		
		e1.add(obj1);
		e1.add(obj2);
		
		Manager obj11 = new Manager();
		obj11.Read("i2930", "Nassds", "address2", "d1", 10, 11, 12);
		
		Manager obj22 = new Manager();
		obj11.Read("i2930", "Nassds", "address2", "d2", 13, 14, 15);
		
		e1.add(obj11);
		e1.add(obj22);
	
		 
		
		
	}

}
