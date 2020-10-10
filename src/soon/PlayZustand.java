package soon;

public class PlayZustand extends PowerOn {
	
	public PlayZustand(Soon s) {
		super(s);
	}
	
	public void stopButton() {
		exit();
		s.setZustand(s.getStopZustand());
		s.getZustand().entry();
	}

	public void volumeUpButton() {
		s.volumeUp();
	}

	public void volumeDownButton() {
		s.volumeDown();
	}
	
	public void entry() {
		s.startPlay();
	}
	
	public void exit() {
		s.stopPlay();
	}
}
