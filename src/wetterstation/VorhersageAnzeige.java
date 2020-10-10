package wetterstation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class VorhersageAnzeige implements PropertyChangeListener {
	private float aktuellerLuftdruck = 29.92f;  
	private float letzterLuftdruck;
	WetterDaten wetterDaten;
	
	public VorhersageAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyChangeListener(this);
	}
	
	public void propertyChange(PropertyChangeEvent e) {
		switch (e.getPropertyName()) {
			case "Luftdruck": 
	            letzterLuftdruck = aktuellerLuftdruck;
				aktuellerLuftdruck = (float)e.getNewValue();
				anzeigen();
				break;
			default:
				break;
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
