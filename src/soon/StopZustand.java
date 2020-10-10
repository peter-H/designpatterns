package soon;

public class StopZustand extends Zustand {
	
	public StopZustand(Soon s) {
		super(s);
	}
	
	public void playButton() {
		exit();
		s.setZustand(s.getPlayZustand());
		s.getZustand().entry();
	}
}
