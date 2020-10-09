package aliensimulator.aliens;

import aliensimulator.verhalten.ErdeFeindlichBesuchen;

public class AlienMars extends Alien {
	
	public AlienMars(){
		this.setErdeBesuchverhalten(new ErdeFeindlichBesuchen());
	}

	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mars.");
	}
}
