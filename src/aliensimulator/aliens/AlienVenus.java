package aliensimulator.aliens;

import aliensimulator.verhalten.ErdeFreundlichBesuchen;

public class AlienVenus extends Alien {
	
	public AlienVenus(){
		this.setErdeBesuchverhalten(new ErdeFreundlichBesuchen());
	}

	public void darstellen() {
		System.out.println("Ich bin das Alien von der Venus.");
	}
}
