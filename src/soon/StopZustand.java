package soon;

public class StopZustand extends PowerOnZustand {
	
	public StopZustand(Soon s, PowerOn p) {
		super(s, p);
	}
	
	public void playButton() {
		exit();
		p.setZustand(p.getPlayZustand());
		p.getZustand().entry();
	}
}
