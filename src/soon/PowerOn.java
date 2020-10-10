package soon;

public abstract class PowerOn extends Zustand {

	public PowerOn(Soon s) {
		super(s);
	}
	
	public void powerButton() {
		s.setZustand(s.getPowerOffZustand());
		System.out.println("Ausschalten");
	}
}
