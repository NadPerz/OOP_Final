package june_2024_q4;

public class Main {

	 public static void main(String[] args) {
	        // Create receiver objects
	        Television tv = new Television();
	        SoundSystem soundSystem = new SoundSystem();
	        
	        // Get singleton RemoteControl instance
	        RemoteControl remote = RemoteControl.getInstance();
	        
	        // Create command objects
	        Command tvOn = new TvOnCommand(tv);
	        Command setChannel = new SetChannelCommand(tv, 101);  // Pass channel number
	        Command soundOn = new SoundOnCommand(soundSystem);
	        Command increaseVol = new IncreaseVolumeCommand(soundSystem);
	        
	        // Set commands to remote slots
	        remote.setCommand(0, tvOn);
	        remote.setCommand(1, setChannel);
	        remote.setCommand(2, soundOn);
	        remote.setCommand(3, increaseVol);
	        
	        // Test the system
	        remote.pressButton(0);  // TV Turned on
	        remote.pressButton(1);  // TV channelset to 101
	        remote.pressButton(2);  // SoundSystem Turned on
	        remote.pressButton(3);  // Sound System Volume Increased
	    }

}
