package soon;

public class StopZustand extends PlayerZustand {
	
	public StopZustand(Soon s, PowerOn p) {
		super(s, p);
	}
	
	public void playButton() {
		exit();
		p.setPlayerZustand(p.getPlayZustand());
		p.getPlayerZustand().entry();
	}
}
