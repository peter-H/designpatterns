package aliensimulator.predators;

import aliens_3rdparty.NeutralBesuchen;
import aliensimulator.verhalten.ErdeNeutralAdapter;

public class HishQuTen extends Predator {

	static {
		PredatorRegistry.register(new HishQuTen());
	}

	public HishQuTen() {
		this.setErdeBesuchverhalten(new ErdeNeutralAdapter(new NeutralBesuchen()));
	}

	@Override
	public void darstellen() {
		System.out.println("Ich bin ein Hish-Qu-Ten.");
	}

	@Override
	public Boolean canHandle(String type) {
		return type.equalsIgnoreCase("hishquten");
	}
}
