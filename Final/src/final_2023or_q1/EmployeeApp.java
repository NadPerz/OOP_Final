package final_2023or_q1;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {

		ArrayList <Employee> e1 = new ArrayList<>();
		ArrayList <Manager> m1   = new ArrayList<>();

		
		Employee obj1 = new Employee();
		obj1.Read();
		
		Employee obj2 = new Employee();
		obj2.Read();
		
		e1.add(obj1);
		e1.add(obj2);
		
		Manager obj11 = new Manager();
		obj11.Read();
		
		Manager obj22 = new Manager();
		obj11.Read();
		
		e1.add(obj11);
		e1.add(obj22);
	
		obj1.Prrint();
		obj2.Prrint();
		
		obj11.Print();
		obj22.Print();
		 
		
		
	}

}
