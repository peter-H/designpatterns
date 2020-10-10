package kaugummiautomat;

import java.util.Random;

public class HatMuenzeZustand implements Zustand {
	Random randomGewinn = new Random(System.currentTimeMillis());
	KaugummiAutomat kaugummiAutomat;
 
	public HatMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
		this.kaugummiAutomat = kaugummiAutomat;
	}
  
	public void muenzeEinwerfen() {
		System.out.println("Sie können keine weitere Münze einwerfen");
	}
 
	public void muenzeAuswerfen() {
		System.out.println("Münze wird zurückgegeben");
		kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMuenzeZustand());
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben den Griff gedreht ...");
		int gewinn = randomGewinn.nextInt(10);
		if ((gewinn == 0) && (kaugummiAutomat.getAnzahl() > 1)) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getGewinnZustand());
		} else {
			kaugummiAutomat.setZustand(kaugummiAutomat.getVerkauftZustand());
		}
	}

    public void kugelAuswerfen() {
        System.out.println("Es wird keine Kugel ausgegeben");
    }
 
	public String toString() {
		return "bereit für Drehen des Griffs";
	}
}
