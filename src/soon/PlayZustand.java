package soon;

public class PlayZustand extends PlayerZustand {
	
	public PlayZustand(Soon s, PowerOn p) {
		super(s, p);
	}
	
	public void stopButton() {
		exit();
		p.setPlayerZustand(p.getStopZustand());
		p.getPlayerZustand().entry();
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
