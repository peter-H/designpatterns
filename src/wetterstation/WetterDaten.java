package wetterstation;

import java.util.ArrayList;
import java.util.Arrays;

public class WetterDaten {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	ArrayList<Beobachter> beobachter = new ArrayList<Beobachter>(
			Arrays.<Beobachter>asList(new AktuelleBedingungenAnzeige(),
					    			  new StatistikAnzeige(),
									  new VorhersageAnzeige()));
	
	public void benachrichtigeBeobachter() {
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter observer = (Beobachter)beobachter.get(i);
			observer.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	
	public void messwerteGeaendert() {
		System.out.println(this.toString());
		benachrichtigeBeobachter();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwerteGeaendert();
	}
	
	public float getTemperatur() {
		return temperatur;
	}
	
	public float getFeuchtigkeit() {
		return feuchtigkeit;
	}
	
	public float getLuftdruck() {
		return luftdruck;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMesswerte:\n");
		result.append("----------\n");
		result.append("Temperatur: " + getTemperatur() + "\n");
		result.append("Luftfeuchtigkeit: " + getFeuchtigkeit() + "\n");
		result.append("Luftdruck: " + getLuftdruck() + "\n");
		return result.toString();
	}
}
