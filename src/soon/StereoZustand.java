package soon;

public class StereoZustand extends SpeakerZustand {

	public StereoZustand(Soon s, PowerOn p) {
		super(s, p);
	}

	public void speakerButton() {
		s.setSurround();
		p.setSpeakerZustand(p.getSurroundZustand());
	}
}
