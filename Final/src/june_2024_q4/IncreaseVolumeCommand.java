package june_2024_q4;

public class IncreaseVolumeCommand implements Command {

	SoundSystem sound;
	
	
	
	public IncreaseVolumeCommand(SoundSystem sound) {
		super();
		this.sound = sound;
	}



	@Override
	public void execute() {

		sound.increaseVolume();
	}

}
