package final_2023or_q1;

import java.util.Scanner;

public class Manager extends Employee {

	
	private String department;
	private int productNo1;
	private int productNo2;
	private int productNo3;
	
	
	
	
	public Manager() {

	
	}



	public Manager(String empid, String name, String address) {
		super(empid, name, address);
	}





	public Manager(String empid, String name, String address, String department, int productNo1, int productNo2,
			int productNo3) {
		super(empid, name, address);
		this.department = department;
		this.productNo1 = productNo1;
		this.productNo2 = productNo2;
		this.productNo3 = productNo3;
	}
	
	
	
 

	public void Read(String empid, String name, String address, String department, int productNo1, int productNo2, int productNo3) {


		Read();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Department Name");
		department = scanner.nextLine();
		
		try {
			System.out.println("Product No 1");
			productNo1 = scanner.nextInt();
			
			System.out.println("Product No 2");
			productNo2 = scanner.nextInt();
			
			System.out.println("Product No 3");
			productNo3 = scanner.nextInt();
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
	}
	
	
	public void Print() {
		
		Prrint();
		System.out.println("Manager departement  "+department);
		System.out.println("Product 1"+productNo1);
		System.out.println("Product 2"+productNo2);
		System.out.println("Product 3"+productNo3);
	}


}
