package monster;

import monster.Monster;

public class Drache extends Monster {

	public Drache() {
		super();
		schreckwert = 5;
	}
	
	public void darstellenMonster() {
		System.out.println("Ich bin ein Drache mit Schreckwert: " + berechneSchreckwert());
	}
}
