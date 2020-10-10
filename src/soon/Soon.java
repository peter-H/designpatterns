package soon;

public class Soon {
	Zustand stopZustand;
	Zustand playZustand;
	
	Zustand zustand;
	
	public Soon () {
		stopZustand = new StopZustand(this);
		playZustand = new PlayZustand(this);
		zustand = stopZustand;
	}

	public Zustand getStopZustand() {
		return stopZustand;
	}

	public Zustand getPlayZustand() {
		return playZustand;
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
	
	public void startPlay() {
		System.out.println("Musik an");
	}
	
	public void stopPlay() {
		System.out.println("Musik aus");
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nSoon MP3 Player");
		result.append("\n---------------");
		result.append("\nSoon available soon in MyCross-Platform Software Store\n");
		return result.toString();
	}
}
