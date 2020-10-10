package wetterstation;
	
public class AktuelleBedingungenAnzeige implements Beobachter {
	private float temperatur;
	private float feuchtigkeit;
	
	public AktuelleBedingungenAnzeige(WetterDaten wetterDaten) {
		wetterDaten.registriereBeobachter(this);
	}
	
	public void aktualisieren(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		anzeigen();
	}
	
	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: " + temperatur 
			+ " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
