package soon;

public class StopZustand extends Zustand {
	
	public StopZustand(Soon s) {
		super(s);
	}
	
	public void playButton() {
		s.startPlay();
		s.setZustand(s.getPlayZustand());
	}
}
