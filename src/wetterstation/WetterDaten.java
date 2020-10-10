package wetterstation;

import java.util.ArrayList;

public class WetterDaten {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	ArrayList<Beobachter> beobachter = new ArrayList<Beobachter>();
	
	public void registriereBeobachter(Beobachter b) {
		beobachter.add(b);
	}
	
	public void entferneBeobachter(Beobachter b) {
		int i = beobachter.indexOf(b);
		if (i >= 0) {
			beobachter.remove(i);
		}
	}
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
