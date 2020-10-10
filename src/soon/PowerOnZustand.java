package soon;

public abstract class PowerOnZustand {
	Soon s;
	PowerOn p;
	
	public PowerOnZustand(Soon s, PowerOn p) {
		this.s = s;
		this.p = p;
	}
	
	public void playButton() {};
	public void stopButton() {};
	public void volumeUpButton() {};
	public void volumeDownButton() {};
	public void entry() {};
	public void exit() {};
}
