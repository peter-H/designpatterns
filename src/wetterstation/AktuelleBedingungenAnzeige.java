package wetterstation;

public class AktuelleBedingungenAnzeige implements Beobachter {
	private float temperatur;
	private float feuchtigkeit;
	WetterDaten wetterDaten;
	
	public AktuelleBedingungenAnzeige(WetterDaten wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}
	
	public void aktualisieren() {
		this.temperatur = wetterDaten.getTemperatur();
		this.feuchtigkeit = wetterDaten.getFeuchtigkeit();
		anzeigen();
	}
	
	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: " + temperatur 
			+ " Grad C und " + feuchtigkeit + "% Luftfeuchtigkeit");
	}
}
