package june_2024_q4;

public class TvOnCommand implements Command {

	Television tv;
	
	
	
	public TvOnCommand(Television tv) {
		super();
		this.tv = tv;
	}



	@Override
	public void execute() {
		
		tv.turnOn();
	}

}
