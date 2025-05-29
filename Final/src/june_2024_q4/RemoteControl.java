package june_2024_q4;

public class RemoteControl {

	private static RemoteControl controller;
	
	private Command[] command ;
	private int slot;
	
	
	
	private RemoteControl() {
		command = new Command[10];
	}

	public static RemoteControl getInstance() {
		
		if(controller == null) {
			controller  = new RemoteControl();
		}
		
		return controller;
		
	}
	
	
	
	


	public void setCommand(int slot,Command cmnd) {
		  if (slot >= 0 && slot < command.length) {
	            command[slot] = cmnd;  // Store command at specific slot
	        }
	}

	public void pressButton(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	 
	
	
}
