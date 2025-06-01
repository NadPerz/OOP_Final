package final_2023or_q1;

import java.util.Scanner;

public class Employee {
	protected String empid;
	protected String name;
	protected String address;
	
	
	
	
	 public Employee() {
		super();
	}



	public Employee(String empid, String name, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}



	public void Read() {
	 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID");
		empid = scanner.nextLine();
		
		
		System.out.println("Enter employee name");
		name = scanner.nextLine();
	
		System.out.println("Enter employee address");
		address = scanner.nextLine();
		
	}
	
	

	public void Prrint() {
		System.out.println("Id is "+empid);
		System.out.println("Name is"+name);
		System.out.println("Address is"+address);
	}


 
	
	
	
	
	
}
