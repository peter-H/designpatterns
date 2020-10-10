package wetterstation;


public class VorhersageAnzeige implements Beobachter {
	private float aktuellerLuftdruck = 29.92f;  
	private float letzterLuftdruck;
	WetterDaten wetterDaten;
	
	public VorhersageAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}
	
	public void aktualisieren(Subjekt s) {
		if (s instanceof WetterDaten) {
			letzterLuftdruck = aktuellerLuftdruck;
			aktuellerLuftdruck = ((WetterDaten) s).getLuftdruck();
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
