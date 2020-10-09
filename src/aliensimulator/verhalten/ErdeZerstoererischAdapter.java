package aliensimulator.verhalten;

import aliens_3rdparty.ZerstoererischBesuchen;

public class ErdeZerstoererischAdapter extends ZerstoererischBesuchen implements ErdeBesuchverhalten {

	@Override
	public void erdeBesuchen() {
		zerstoere();
	}
}
