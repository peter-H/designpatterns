package soon;

public abstract class SpeakerZustand {
	Soon s;
	PowerOn p;
	
	public SpeakerZustand(Soon s, PowerOn p) {
		this.s = s;
		this.p = p;
	}
	
	public void speakerButton() {};
}
