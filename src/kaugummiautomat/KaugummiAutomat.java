package kaugummiautomat;

public class KaugummiAutomat {
 
	final static int AUSVERKAUFT = 0;
	final static int KEINE_MUENZE = 1;
	final static int HAT_MUENZE = 2;
	final static int VERKAUFT = 3;
 
	int zustand = AUSVERKAUFT;
	int anzahl = 0;
  
	public KaugummiAutomat(int anzahl) {
		this.anzahl = anzahl;
		if (anzahl > 0) {
			zustand = KEINE_MUENZE;
		}
	}
  
	public void muenzeEinwerfen() {
		if (zustand == HAT_MUENZE) {
			System.out.println("Sie können keine weitere Münze einwerfen");
		} else if (zustand == KEINE_MUENZE) {
			zustand = HAT_MUENZE;
			System.out.println("Sie haben eine Münze eingeworfen");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Sie können keine Münze einwerfen, Automat ist ausverkauft");
		} else if (zustand == VERKAUFT) {
        	System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
		}
	}

	public void muenzeAuswerfen() {
		if (zustand == HAT_MUENZE) {
			System.out.println("Münze wird zurückgegeben");
			zustand = KEINE_MUENZE;
		} else if (zustand == KEINE_MUENZE) {
			System.out.println("Sie haben keine Münze eingeworfen");
		} else if (zustand == VERKAUFT) {
			System.out.println("Zu spät, leider haben Sie den Griff schon gedreht");
		} else if (zustand == AUSVERKAUFT) {
        	System.out.println("Auswurf nicht möglich, Sie haben keine Münze eingeworfen");
		}
	}
 

 
 
	public void griffDrehen() {
		if (zustand == VERKAUFT) {
			System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel!");
		} else if (zustand == KEINE_MUENZE) {
			System.out.println("Sie haben gedreht, aber es ist keine Münze da");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
		} else if (zustand == HAT_MUENZE) {
			System.out.println("Sie haben den Griff gedreht ...");
			zustand = VERKAUFT;
			kugelAusgeben();
		}
	}
 
	public void kugelAusgeben() {
		if (zustand == VERKAUFT) {
			System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
			anzahl = anzahl - 1;
			if (anzahl == 0) {
				System.out.println("Hoppla, keine Kugeln da!");
				zustand = AUSVERKAUFT;
			} else {
				zustand = KEINE_MUENZE;
			}
		} else if (zustand == KEINE_MUENZE) {
			System.out.println("Sie müssen zuerst bezahlen");
		} else if (zustand == AUSVERKAUFT) {
			System.out.println("Es wird keine Kugel ausgegeben");
		} else if (zustand == HAT_MUENZE) {
			System.out.println("Es wird keine Kugel ausgegeben");
		}
	}
 
	public void auffuellen(int anzahl) {
		this.anzahl = anzahl;
		zustand = KEINE_MUENZE;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gestützter Kaugummi-Standautomat Modell Nr. 2005\n");
		result.append("Bestand: " + anzahl + " Kaugummikugel");
		if (anzahl != 1) {
			result.append("n");
		}
		result.append("\nAutomat ");
		if (zustand == AUSVERKAUFT) {
			result.append("ausverkauft");
		} else if (zustand == KEINE_MUENZE) {
			result.append("bereit für Münzeinwurf");
		} else if (zustand == HAT_MUENZE) {
			result.append("bereit für Drehen des Griffs");
		} else if (zustand == VERKAUFT) {
			result.append("gibt Kugel aus");
		}
		result.append("\n");
		return result.toString();
	}
}


