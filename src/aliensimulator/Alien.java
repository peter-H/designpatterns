package aliensimulator;

public abstract class Alien {
	
	protected ErdeBesuchverhalten erdeBesuchverhalten;

	abstract void darstellen();

	public void fliegen() {
		System.out.println("Ich fliege durch den Weltraum.");
	}
	
	public void erdeBesuchen(){
		erdeBesuchverhalten.erdeBesuchen();
	}

	public ErdeBesuchverhalten getErdeBesuchverhalten() {
		return erdeBesuchverhalten;
	}

	public void setErdeBesuchverhalten(ErdeBesuchverhalten erdeBesuchverhalten) {
		this.erdeBesuchverhalten = erdeBesuchverhalten;
	}
}
