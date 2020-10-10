package wetterstation;

import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungenAnzeige implements Observer {
	private float temperatur;
	private float feuchtigkeit;
	WetterDaten wetterDaten;
	
	public AktuelleBedingungenAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addObserver(this);
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof WetterDaten) {
			this.temperatur = ((WetterDaten) o).getTemperatur();
			this.feuchtigkeit = ((WetterDaten) o).getFeuchtigkeit();
			anzeigen();
		}
	}
	
	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: " + temperatur 
			+ " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
