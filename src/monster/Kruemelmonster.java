package monster;

public class Kruemelmonster extends Monster {

	public Kruemelmonster() {
		super();
		schreckwert = -5;
	}
	
	public void darstellenMonster() {
		System.out.println("Ich bin ein Kruemelmonster mit Schreckwert: " + berechneSchreckwert());
	}
}
