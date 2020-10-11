package aliensimulator.predators;

import aliens_3rdparty.ZerstoererischBesuchen;
import aliensimulator.verhalten.ErdeZerstoererischAdapter;

public class Yautja extends Predator {

	static {
		PredatorRegistry.register(new Yautja());
	}

	public Yautja() {
		this.setErdeBesuchverhalten(new ErdeZerstoererischAdapter());
	}

	@Override
	public void darstellen() {
		System.out.println("Ich bin ein Yautja.");
	}

	@Override
	public Boolean canHandle(String type) {
		return type.equalsIgnoreCase("yautja");
	}
}
