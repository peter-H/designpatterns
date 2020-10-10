package wetterstation;

public class WetterDaten {
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	AktuelleBedingungenAnzeige anzeige = new AktuelleBedingungenAnzeige();
	StatistikAnzeige statistik = new StatistikAnzeige();
	VorhersageAnzeige vorhersage = new VorhersageAnzeige();
	
	public void messwerteGeaendert() {
		System.out.println(this.toString());
		anzeige.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		statistik.neueWerte(temperatur, feuchtigkeit, luftdruck);
		vorhersage.aktuelleWerte(temperatur, feuchtigkeit, luftdruck);
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
