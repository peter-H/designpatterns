package aliensimulator.aliens;

import aliensimulator.verhalten.ErdeFreundlichBesuchen;

public class AlienMond extends Alien {
	
	public AlienMond(){
		this.setErdeBesuchverhalten(new ErdeFreundlichBesuchen());
	}
	
	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mond.");
	}
}
