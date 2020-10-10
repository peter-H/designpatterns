package soon;

public class PowerOff extends Zustand {

	public PowerOff(Soon s) {
		super(s);
	}
	
	public void powerButton() {
		exit();
		s.setZustand(s.getPowerOnZustand());
		System.out.println("Anschalten");
		s.getZustand().entry();
	}
}
