package final_2023or_q1;

public class Employee {
	protected String empid;
	protected String name;
	protected String address;
	
	
	
	 public void Read(String empid, String name, String address) {
	 
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	
	

	public void Print() {
		System.out.println("Id is "+empid);
		System.out.println("Name is"+name);
		System.out.println("Address is"+address);
	}


 
	
	
	
	
	
}
