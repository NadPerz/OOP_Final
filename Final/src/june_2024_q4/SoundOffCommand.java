package june_2024_q4;

public class SoundOffCommand implements Command {

	SoundSystem sound;
	
	
	
	public SoundOffCommand(SoundSystem sound) {
		super();
		this.sound = sound;
	}



	@Override
	public void execute() {

		sound.turnOff();
	}

}
