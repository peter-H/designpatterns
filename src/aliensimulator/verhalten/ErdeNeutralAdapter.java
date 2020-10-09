package aliensimulator.verhalten;

import aliens_3rdparty.NeutralBesuchen;

public class ErdeNeutralAdapter implements ErdeBesuchverhalten {

	private NeutralBesuchen neutralBesuchen;
	
	public ErdeNeutralAdapter(NeutralBesuchen neutralBesuchen) {
		this.neutralBesuchen = neutralBesuchen;
	}
	
	@Override
	public void erdeBesuchen() {
		neutralBesuchen.abwarten();
	}
}
