package soon;

public abstract class PowerOn extends Zustand {

	public PowerOn(Soon s) {
		super(s);
	}
	
	public void powerButton() {
		exit();
		s.setPowerOnHistory(s.getZustand());
		s.setZustand(s.getPowerOffZustand());
		System.out.println("Ausschalten");
	}
}
