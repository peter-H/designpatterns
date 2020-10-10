package monster;

import java.util.ArrayList;
import java.util.Iterator;

import gegenstaende.Gegenstand;

public abstract class Monster {
	protected int schreckwert;
	protected ArrayList<Gegenstand> gegenstaende;
	
	public Monster() {
		gegenstaende = new ArrayList<Gegenstand>();
	}
	
	public abstract void darstellenMonster();
	
	public void addGegenstand(Gegenstand g) {
		gegenstaende.add(g);
	}
	
	public Iterator<Gegenstand> getGegenstaende() {
		return gegenstaende.iterator();
	}
	
	public int berechneSchreckwert() {
		int sum;
		
		sum = schreckwert;
		Iterator<Gegenstand> i = getGegenstaende();
		while (i.hasNext()) {
			sum = sum + ((Gegenstand)i.next()).getSchreckwert();
		}
		
		return sum;
	}
	
	public void darstellen() {
		darstellenMonster();
		Iterator<Gegenstand> i = getGegenstaende();
		while (i.hasNext()) {
			System.out.println("Ich besitze: " + ((Gegenstand)i.next()).getBeschreibung());
		}
	}
}
