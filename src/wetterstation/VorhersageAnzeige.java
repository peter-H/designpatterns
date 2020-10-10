package wetterstation;

import java.util.Observable;
import java.util.Observer;

public class VorhersageAnzeige implements Observer {
	private float aktuellerLuftdruck = 29.92f;  
	private float letzterLuftdruck;
	WetterDaten wetterDaten;
	
	public VorhersageAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyListener(this);
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof EigenschaftenSubjekt) {
			WetterDaten daten = (WetterDaten) arg;
			letzterLuftdruck = aktuellerLuftdruck;
			aktuellerLuftdruck = daten.getLuftdruck();
			anzeigen();
		}
	}

	public void anzeigen() {
		System.out.print("Vorhersage: ");
		if (aktuellerLuftdruck > letzterLuftdruck) {
			System.out.println("Wetter-Besserung in Sicht!");
		} else if (aktuellerLuftdruck == letzterLuftdruck) {
			System.out.println("Wetter geht weiter so.");
		} else if (aktuellerLuftdruck < letzterLuftdruck) {
			System.out.println("Gehen Sie von kaelterem, regnerischem Wetter aus.");
		}
	}
}
