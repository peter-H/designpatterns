package aliensimulator.aliens;

import aliensimulator.verhalten.ErdeBesuchverhalten;

public abstract class Alien {
	
	private ErdeBesuchverhalten erdeBesuchverhalten;

	public abstract void darstellen();

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
