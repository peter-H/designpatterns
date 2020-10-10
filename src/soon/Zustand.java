package soon;

public abstract class Zustand {
	protected Soon s;

	public Zustand(Soon k) {
		this.s = k;
	}

	public void playButton() {};
	public void stopButton() {};
	public void volumeUpButton() {};
	public void volumeDownButton() {};
	public void entry() {};
	public void exit() {};
	public void powerButton() {};
}
