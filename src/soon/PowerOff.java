package soon;

public class PowerOff extends Zustand {
	
	public PowerOff(Soon s) {
		super(s);
	}
	
	public void powerButton() {
		s.setZustand(s.getStopZustand());
		System.out.println("Anschalten");
	}
}
