package june_2024_q4;

public class SetChannelCommand implements Command {

	Television tv;
	
	
	
	
	public SetChannelCommand(Television tv, int i) {
		super();
		this.tv = tv;
	}




	@Override
	public void execute() {

		tv.setChanel(0);
	}

}
