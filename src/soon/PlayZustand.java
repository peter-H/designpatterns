package soon;

public class PlayZustand extends Zustand {
	
	public PlayZustand(Soon s) {
		super(s);
	}
	
	public void stopButton() {
		s.stopPlay();
		s.setZustand(s.getStopZustand());
	}
}
