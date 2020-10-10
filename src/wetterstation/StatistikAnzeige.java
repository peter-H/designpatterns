package wetterstation;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StatistikAnzeige implements PropertyChangeListener {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int anzMesswerte;
	WetterDaten wetterDaten;

	public StatistikAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.addPropertyChangeListener(this);
	}
	
	public void propertyChange(PropertyChangeEvent e) {
		float temp;
		
		switch (e.getPropertyName()) {
			case "Temperatur": 
				temp = (float)e.getNewValue();
				tempSum += temp;
				anzMesswerte++;

				if (temp > maxTemp) {
					maxTemp = temp;
				}
	 
				if (temp < minTemp) {
					minTemp = temp;
				}

				anzeigen();
				break;
			default:
				break;
		}
 	}

	public void anzeigen() {
		System.out.println("Mit/Max/Min Temperatur = " + (tempSum / anzMesswerte)
			+ "/" + maxTemp + "/" + minTemp);
	}
}
