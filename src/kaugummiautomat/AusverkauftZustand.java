package kaugummiautomat;

public class AusverkauftZustand implements Zustand {
    KaugummiAutomat kaugummiAutomat;
 
    public AusverkauftZustand(KaugummiAutomat kaugummiAutomat) {
        this.kaugummiAutomat = kaugummiAutomat;
    }
 
	public void muenzeEinwerfen() {
		System.out.println("Sie konnen keine Münze einwerfen, Automat ist ausverkauft");
	}
 
	public void muenzeAuswerfen() {
		System.out.println("Auswurf nicht möglich, Sie haben keine Münze eingeworfen");
	}
 
	public void griffDrehen() {
		System.out.println("Sie haben gedreht, aber es sind keine Kugeln da");
	}
 
	public void kugelAuswerfen() {
		System.out.println("Es wird keine Kugel ausgegeben");
	}
 
	public String toString() {
		return "ausverkauft";
	}
}
