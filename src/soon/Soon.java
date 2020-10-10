package soon;

public class Soon {
	Zustand powerOnZustand;
	Zustand powerOffZustand;
	
	Zustand zustand;
	
	public Soon () {
		powerOnZustand = new PowerOn(this);
		powerOffZustand = new PowerOff(this);
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

	public void startPlay() {
		System.out.println("Musik an");
	}
	
	public void stopPlay() {
		System.out.println("Musik aus");
	}

	public void volumeUp() {
		System.out.println("Lauter");
	}
	
	public void volumeDown() {
		System.out.println("Leiser");
	}

	public void powerLED_On() {
		System.out.println("LED on");
	}
	
	public void powerLED_Off() {
		System.out.println("LED off");
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nSoon MP3 Player");
		result.append("\n---------------\n");
		return result.toString();
	}

}
