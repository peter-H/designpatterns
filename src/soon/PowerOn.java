package soon;

public class PowerOn extends Zustand {
	PlayerZustand playZustand;
	PlayerZustand stopZustand;
	SpeakerZustand stereoZustand;
	SpeakerZustand surroundZustand;

	PlayerZustand playerZustand;
	SpeakerZustand speakerZustand;
	
	public PowerOn(Soon s) {
		super(s);
		stopZustand = new StopZustand(s, this);
		playZustand = new PlayZustand(s, this);
		stereoZustand = new StereoZustand(s,this);
		surroundZustand = new SurroundZustand(s,this);
		playerZustand = stopZustand;
		speakerZustand = stereoZustand;
	}
	
	public PlayerZustand getStopZustand() {
		return stopZustand;
	}

	public PlayerZustand getPlayZustand() {
		return playZustand;
	}

	public SpeakerZustand getStereoZustand() {
		return stereoZustand;
	}
	
	public SpeakerZustand getSurroundZustand() {
		return surroundZustand;
	}
	
	public PlayerZustand getPlayerZustand() {
		return playerZustand;
	}

	public void setPlayerZustand(PlayerZustand zustand) {
		this.playerZustand = zustand;
	}
	
	public SpeakerZustand getSpeakerZustand() {
		return speakerZustand;
	}

	public void setSpeakerZustand(SpeakerZustand zustand) {
		this.speakerZustand = zustand;
	}

	public void playButton() {
		System.out.println("Play Button");
		playerZustand.playButton();
	}
	
	public void stopButton() {
		System.out.println("Stop Button"); 
		playerZustand.stopButton();
	}
	
	public void volumeUpButton() {
		System.out.println("Volume Up Button"); 
		playerZustand.volumeUpButton();
	}
	
	public void volumeDownButton() {
		System.out.println("Volume Down Button"); 
		playerZustand.volumeDownButton();
	}

	public void powerButton() {
		System.out.println("Power Button: Ausschalten");
		exit();
		s.setZustand(s.getPowerOffZustand());
		s.getZustand().entry();
	}
	
	public void speakerButton() {
		System.out.println("Speaker Button"); 
		speakerZustand.speakerButton();
	}
	
	
	public void entry() {
		s.powerLED_On();
		playerZustand.entry();
	}
	
	public void exit() {
		s.powerLED_Off();
		playerZustand.exit();
	}
}
