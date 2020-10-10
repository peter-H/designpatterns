package wetterstation;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class WetterDaten extends SensorDaten {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	private float old_temperatur;
	private float old_feuchtigkeit;
	private float old_luftdruck;
	private PropertyChangeSupport changes;
	
	public WetterDaten() {
		changes = new PropertyChangeSupport(this);
	}

	public void addPropertyChangeListener(PropertyChangeListener l) {
		changes.addPropertyChangeListener(l);
	}

	public void removePropertyChangeListener(PropertyChangeListener l) {
		changes.removePropertyChangeListener(l);
	}
	
	public void messwerteGeaendert() {
		System.out.println(this.toString());
		changes.firePropertyChange("Temperatur", old_temperatur, temperatur);
		changes.firePropertyChange("Feuchtigkeit", old_feuchtigkeit, feuchtigkeit);
		changes.firePropertyChange("Luftdruck", old_luftdruck, luftdruck);
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		old_temperatur = this.temperatur;
		old_feuchtigkeit = this.feuchtigkeit;
		old_luftdruck = this.luftdruck;
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
