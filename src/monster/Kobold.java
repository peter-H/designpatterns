package monster;

public class Kobold extends Monster {

	public Kobold() {
		super();
		schreckwert = 0;
	}
	
	public void darstellenMonster() {
		System.out.println("Ich bin ein Kobold mit Schreckwert: " + berechneSchreckwert());
	}
}
