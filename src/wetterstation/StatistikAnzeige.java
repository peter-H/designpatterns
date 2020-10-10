package wetterstation;

import java.util.Observable;
import java.util.Observer;

public class StatistikAnzeige implements Observer {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int anzMesswerte;
	WetterDaten wetterDaten;

	public StatistikAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyListener(this);
	}
	
	public void update(Observable o, Object arg) {
		if (o instanceof EigenschaftenSubjekt) {
			WetterDaten daten = (WetterDaten) arg;
			float temp = daten.getTemperatur();
			tempSum += temp;
			anzMesswerte++;

			if (temp > maxTemp) {
				maxTemp = temp;
			}
 
			if (temp < minTemp) {
				minTemp = temp;
			}

			anzeigen();
		}
	}

	public void anzeigen() {
		System.out.println("Mit/Max/Min Temperatur = " + (tempSum / anzMesswerte)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
