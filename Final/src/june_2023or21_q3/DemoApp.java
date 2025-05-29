package june_2023or21_q3;

import java.util.Scanner;

public class DemoApp {
	 public static void main(String[] args) {
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 
			System.out.println("Enter User name");
			String uname = scanner.nextLine();
			
			System.out.println("Enter Password");
			String password = scanner.nextLine();
			
		 try {
		
			if (uname.length() < 6){
				
				throw new InvalidUserName("The Username must be at least 6 characters long");
			
			}else if(password.length() < 8) {
				
				throw new InvalidPasswordLength("The password must be at least 8 characters long");
				
			}else if(!(password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*\\d.*"))) {
				
				throw new InvalidPasswrd("The password must be at least one uppercase letter, one lowercase letter, and one digit");
			}
			
			System.out.println("You got correct user name and password ");
			
		}catch (InvalidUserName e) {

			System.out.println(e.getMessage());
		}catch (InvalidPasswordLength e) {
			
			System.out.println(e.getMessage());
		}catch (InvalidPasswrd e) {
			
			System.out.println(e.getMessage());
		}
		  
	}
}
