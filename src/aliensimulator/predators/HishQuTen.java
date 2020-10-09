package aliensimulator.predators;

import aliens_3rdparty.NeutralBesuchen;
import aliensimulator.verhalten.ErdeNeutralAdapter;

public class HishQuTen extends Predator {

	public HishQuTen() {
		this.setErdeBesuchverhalten(new ErdeNeutralAdapter(new NeutralBesuchen()));
	}

	@Override
	public void darstellen() {
		System.out.println("Ich bin ein Hish-Qu-Ten.");
	}

}
