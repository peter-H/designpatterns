package soon;

public class PowerOn extends Zustand {
	PowerOnZustand playZustand;
	PowerOnZustand stopZustand;

	PowerOnZustand zustand;
	
	public PowerOn(Soon s) {
		super(s);
		stopZustand = new StopZustand(s, this);
		playZustand = new PlayZustand(s, this);
		zustand = stopZustand;
	}
	
	public PowerOnZustand getStopZustand() {
		return stopZustand;
	}

	public PowerOnZustand getPlayZustand() {
		return playZustand;
	}

	public PowerOnZustand getZustand() {
		return zustand;
	}

	public void setZustand(PowerOnZustand zustand) {
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
		exit();
		s.setZustand(s.getPowerOffZustand());
		System.out.println("Ausschalten");
		s.getZustand().entry();
	}
	
	public void entry() {
		s.powerLED_On();
		zustand.entry();
	}
	
	public void exit() {
		s.powerLED_Off();
		zustand.exit();
	}
}
