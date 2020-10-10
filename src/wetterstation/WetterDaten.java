package wetterstation;

import java.util.Observable;

public class WetterDaten extends Observable {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public void messwerteGeaendert() {
		System.out.println(this.toString());
		setChanged();
		notifyObservers();
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
