package soon;

public abstract class Zustand {
	protected Soon s;

	public Zustand(Soon s) {
		this.s = s;
	}
	public void playButton() {};
	public void stopButton() {};
	public void volumeUpButton() {};
	public void volumeDownButton() {};
	public void entry() {};
	public void exit() {};
}
