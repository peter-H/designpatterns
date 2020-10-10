package wetterstation;

public class WetterStation {

	public static void main(String[] args) {
		WetterDaten wetterDaten = new WetterDaten();
		
		wetterDaten.setMesswerte(30, 65, 30.4f);
		wetterDaten.setMesswerte(32, 70, 29.2f);
		wetterDaten.setMesswerte(28, 90, 29.2f);
	}
}
