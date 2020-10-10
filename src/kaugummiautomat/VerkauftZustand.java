package kaugummiautomat;

public class VerkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public VerkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
       
	public void muenzeEinwerfen() {
		System.out.println("Bitte warten Sie, Sie erhalten eine Kugel");
	}
 
	public void muenzeAuswerfen() {
		System.out.println("Zu spät, leider haben Sie den Griff schon gedreht");
	}
 
	public void griffDrehen() {
		System.out.println("Auch wenn Sie zweimal drehen, bekommen Sie keine zweite Kugel");
	}
 
	public void kugelAuswerfen() {
		kaugummiAutomat.kugelFreigeben();
		if (kaugummiAutomat.getAnzahl() > 0) {
			kaugummiAutomat.setZustand(kaugummiAutomat.getKeineMuenzeZustand());
		} else {
			System.out.println("Hoppla, keine Kugeln da!");
			kaugummiAutomat.setZustand(kaugummiAutomat.getAusverkauftZustand());
		}
	}
 
	public String toString() {
		return "gibt Kugel aus";
	}
}
