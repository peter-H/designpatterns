package soon;

public class PowerOff extends Zustand {

	public PowerOff(Soon s) {
		super(s);
	}
	
	public void powerButton() {
		System.out.println("Power Button: Anschalten");
		exit();
		s.setZustand(s.getPowerOnZustand());
		s.getZustand().entry();
	}
}
