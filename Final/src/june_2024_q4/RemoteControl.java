package june_2024_q4;

public class RemoteControl {

	private static RemoteControl controller;
	
	private Command[] command;
	private int slot;
	
	
	
	private RemoteControl() {
		
	}

	private static RemoteControl getInstance() {
		
		if(controller == null) {
			controller  = new RemoteControl();
			System.out.println("Instanciate the RemoteControl");
		}
		
		return controller;
		
	}
	
	
	
	


	public void setCommand(int slot,Command command) {
		this.command = command;
		this.slot = slot;
	}
	
	
	
	public void pressButton(int slot) {

		
	}
	
	
}
