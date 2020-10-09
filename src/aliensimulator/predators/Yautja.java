package aliensimulator.predators;

import aliens_3rdparty.ZerstoererischBesuchen;
import aliensimulator.verhalten.ErdeZerstoererischAdapter;

public class Yautja extends Predator {

	public Yautja() {
		this.setErdeBesuchverhalten(new ErdeZerstoererischAdapter());
	}

	@Override
	public void darstellen() {
		System.out.println("Ich bin ein Yautja.");
	}

}
