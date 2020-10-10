package kaugummiautomat;

import java.util.Random;

public class KaugummiAutomat {
 
	StateEnum zustand = StateEnum.AUSVERKAUFT;
	int anzahl = 0;
	Random randomGewinn = new Random(System.currentTimeMillis());
  
	public KaugummiAutomat(int anzahl) {
		this.anzahl = anzahl;
		if (anzahl > 0) {
			zustand = StateEnum.KEINE_MUENZE;
		}
	}
  
	public void muenzeEinwerfen() {
		if (zustand == StateEnum.HAT_MUENZE) {
			System.out.println("Sie können keine weitere Münze einwerfen");
		} else if (zustand == StateEnum.KEINE_MUENZE) {
			zustand = StateEnum.HAT_MUENZE;
			System.out.println("Sie haben eine Münze eingeworfen");
		} else if (zustand == StateEnum.AUSVERKAUFT) {
			System.out.println("Sie können keine Münze einwerfen, Automat ist ausverkauft");
		} else if (zustand == StateEnum.VERKAUFT) {
        	System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
		} else if (zustand == StateEnum.WINNER) {
			System.out.println("Bitte warten Sie, Sie erhalten eine Gratiskugel");
		}
		
	}

	public void muenzeAuswerfen() {
		if (zustand == StateEnum.HAT_MUENZE) {
			System.out.println("Münze wird zurückgegeben");
			zustand = StateEnum.KEINE_MUENZE;
		} else if (zustand == StateEnum.KEINE_MUENZE) {
			System.out.println("Sie haben keine Münze eingeworfen");
		} else if (zustand == StateEnum.VERKAUFT) {
			System.out.println("Zu spät, leider haben Sie den Griff schon gedreht");
		} else if (zustand == StateEnum.AUSVERKAUFT) {
        	System.out.println("Auswurf nicht möglich, Sie haben keine Münze eingeworfen");
		} else if (zustand == StateEnum.WINNER) {
			System.out.println("Zu spät, leider haben Sie den Griff schon gedreht");
		}
	}
 

 
 
	public void griffDrehen() {
		if (zustand == StateEnum.VERKAUFT) {
			System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel!");
		} else if (zustand == StateEnum.KEINE_MUENZE) {
			System.out.println("Sie haben gedreht, aber es ist keine Münze da");
		} else if (zustand == StateEnum.AUSVERKAUFT) {
			System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
		} else if (zustand == StateEnum.HAT_MUENZE) {
			System.out.println("Sie haben den Griff gedreht ...");
			int gewinn = randomGewinn.nextInt(3);
			if ((gewinn == 0) && (this.anzahl > 1)) {
				zustand = StateEnum.WINNER;
			} else {
				zustand = StateEnum.VERKAUFT;
			}
			kugelAusgeben();
		} else if (zustand == StateEnum.WINNER) {
			System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel!");
		}
	}
 
	public void kugelAusgeben() {
		if (zustand == StateEnum.VERKAUFT) {
			System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
			anzahl = anzahl - 1;
			if (anzahl == 0) {
				System.out.println("Hoppla, keine Kugeln da!");
				zustand = StateEnum.AUSVERKAUFT;
			} else {
				zustand = StateEnum.KEINE_MUENZE;
			}
		} else if (zustand == StateEnum.KEINE_MUENZE) {
			System.out.println("Sie müssen zuerst bezahlen");
		} else if (zustand == StateEnum.AUSVERKAUFT) {
			System.out.println("Es wird keine Kugel ausgegeben");
		} else if (zustand == StateEnum.HAT_MUENZE) {
			System.out.println("Es wird keine Kugel ausgegeben");
		} else if (zustand == StateEnum.WINNER) {
			System.out.println("\n GEWINN");
			System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
			System.out.println("Eine kostenlose Kugel rollt aus dem Ausgabeschacht");
			anzahl = anzahl - 1;
			if (anzahl == 0) {
				System.out.println("Hoppla, keine Kugeln da!");
				zustand = StateEnum.AUSVERKAUFT;
			} else {
				zustand = StateEnum.KEINE_MUENZE;
			}
		}
	}
 
	public void auffuellen(int anzahl) {
		this.anzahl = anzahl;
		zustand = StateEnum.KEINE_MUENZE;
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
		if (zustand == StateEnum.AUSVERKAUFT) {
			result.append("ausverkauft");
		} else if (zustand == StateEnum.KEINE_MUENZE) {
			result.append("bereit für Münzeinwurf");
		} else if (zustand == StateEnum.HAT_MUENZE) {
			result.append("bereit für Drehen des Griffs");
		} else if (zustand == StateEnum.VERKAUFT) {
			result.append("gibt Kugel aus");
		} else if (zustand == StateEnum.WINNER) {
			result.append("Gewinn");
		}
		
		result.append("\n");
		return result.toString();
	}
}


