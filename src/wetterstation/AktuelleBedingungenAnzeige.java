package wetterstation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class AktuelleBedingungenAnzeige implements PropertyChangeListener {
	private float temperatur;
	private float feuchtigkeit;
	WetterDaten wetterDaten;
	
	public AktuelleBedingungenAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyChangeListener(this);
	}
	
	public void propertyChange(PropertyChangeEvent e) {
		switch (e.getPropertyName()) {
			case "Temperatur": 
				this.temperatur = (float)e.getNewValue();
				System.out.println("Aktuelle Bedingungen: " + temperatur 
						+ " Grad C");
				break;
			case "Feuchtigkeit":
				this.feuchtigkeit = (float)e.getNewValue();
				System.out.println("Aktuelle Bedingungen: " + feuchtigkeit + "% Luftfeuchtigkeit");
				break;
			default:
				break;
		}
	}
	
}
