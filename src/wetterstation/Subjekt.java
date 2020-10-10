package wetterstation;

import java.util.ArrayList;

public abstract class Subjekt {
	private ArrayList<Beobachter> beobachter = new ArrayList<Beobachter>();

	public void registriereBeobachter(Beobachter b) {
		beobachter.add(b);
	}
	
	public void entferneBeobachter(Beobachter b) {
		int i = beobachter.indexOf(b);
		if (i >= 0) {
			beobachter.remove(i);
		}
	}
	
	public void benachrichtigeBeobachter() {
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter observer = (Beobachter)beobachter.get(i);
			observer.aktualisieren(this);
		}
	}

}
