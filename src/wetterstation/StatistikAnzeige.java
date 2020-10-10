package wetterstation;

public class StatistikAnzeige implements Beobachter {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int anzMesswerte;

	public StatistikAnzeige(WetterDaten wetterDaten) {
		wetterDaten.registriereBeobachter(this);
	}
	
	public void aktualisieren(float temp, float feucht, float druck) {
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

	public void anzeigen() {
		System.out.println("Mit/Max/Min Temperatur = " + (tempSum / anzMesswerte)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
