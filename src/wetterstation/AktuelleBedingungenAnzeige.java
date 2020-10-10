package wetterstation;

import java.util.Observable;
import java.util.Observer;


public class AktuelleBedingungenAnzeige implements Observer {
	private float temperatur;
	private float feuchtigkeit;
	WetterDaten wetterDaten;
	
	public AktuelleBedingungenAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyListener(this);
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof EigenschaftenSubjekt) {
			WetterDaten daten = (WetterDaten) arg;
			this.temperatur = daten.getTemperatur();
			this.feuchtigkeit = daten.getFeuchtigkeit();
			anzeigen();
		}
	}
	
	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: " + temperatur 
			+ " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
