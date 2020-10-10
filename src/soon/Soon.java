package soon;

public class Soon {
	Zustand powerOnZustand;
	Zustand powerOffZustand;
	PlayerZustand playerHistory;
	SpeakerZustand speakerHistory;
	
	Zustand zustand;
	
	public Soon () {
		powerOnZustand = new PowerOn(this);
		powerOffZustand = new PowerOff(this);
		playerHistory = ((PowerOn)powerOnZustand).getStopZustand();
		speakerHistory = ((PowerOn)powerOnZustand).getStereoZustand();
		zustand = powerOffZustand;
	}

	public Zustand getPowerOffZustand() {
		return powerOffZustand;
	}

	public Zustand getPowerOnZustand() {
		return powerOnZustand;
	}

	public Zustand getZustand() {
		return zustand;
	}

	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
	
	public void playButton() {
		zustand.playButton();
	}
	
	public void stopButton() {
		zustand.stopButton();
	}
	
	public void volumeUpButton() {
		zustand.volumeUpButton();
	}
	
	public void volumeDownButton() {
		zustand.volumeDownButton();
	}

	public void powerButton() {
		zustand.powerButton();
	}

	public void speakerButton() {
		zustand.speakerButton();
	}
	
	public void startPlay() {
		System.out.println("Soon: Musik an");
	}
	
	public void stopPlay() {
		System.out.println("Soon: Musik aus");
	}

	public void volumeUp() {
		System.out.println("Soon: Lauter");
	}
	
	public void volumeDown() {
		System.out.println("Soon: Leiser");
	}

	public void powerLED_On() {
		System.out.println("Soon: LED on");
	}
	
	public void powerLED_Off() {
		System.out.println("Soon: LED off");
	}

	public void setStereo() {
		System.out.println("Soon: Stereo sound");
	}
	
	public void setSurround() {
		System.out.println("Soon: Surround sound");
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nSoon MP3 Player");
		result.append("\n---------------\n");
		return result.toString();
	}

}
