package final_2023or_q1;

public class Manager extends Employee {

	
	private String department;
	private int productNo1;
	private int productNo2;
	private int productNo3;
	
	
	
	public Manager() {
		 
		department = " ";
		productNo1 = 0;
		productNo2 = 0;
		productNo3 = 0;
	}

	public void Read(String empid, String name, String address, String department, int productNo1, int productNo2, int productNo3) {

	try {
		super.Read(empid, name, address);
		 super.Print();
		 System.out.println("department is "+department);
		 System.out.println("Product is"+productNo1);
		 System.out.println("Product is"+productNo2);
		 System.out.println("Product is"+productNo3);
			
	} catch (Exception e) {

		e.printStackTrace();
	}
		
		
	}


}
