package june_2024_q4;

public class SoundOnCommand implements Command {

	SoundSystem sound;
	
	
	
	public SoundOnCommand(SoundSystem sound) {
		super();
		this.sound = sound;
	}



	@Override
	public void execute() {
		sound.turnOn();
	}

}
