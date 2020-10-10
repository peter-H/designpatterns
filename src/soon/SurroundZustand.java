package soon;

public class SurroundZustand extends SpeakerZustand {

	public SurroundZustand(Soon s, PowerOn p) {
		super(s, p);
	}

	public void speakerButton() {
		s.setStereo();
		p.setSpeakerZustand(p.getStereoZustand());
	}

}
