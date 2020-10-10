package kaugummiautomat;

public class KeineMuenzeZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public KeineMuenzeZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void muenzeEinwerfen() {
		System.out.println("Sie haben eine Münze eingeworfen");
		kaugummiAutomat.setZustand(kaugummiAutomat.getHatMuenzeZustand());
	}
 
	public void muenzeAuswerfen() {
		System.out.println("Sie haben keine Münze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es ist keine Münze da");
	 }
 
	public void kugelAuswerfen() {
		System.out.println("Sie müssen zuerst bezahlen");
	} 
 
	public String toString() {
		return "bereit für Münzeinwurf";
	}
}
