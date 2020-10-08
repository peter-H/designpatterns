package aliensimulator;

import aliens_3rdparty.AlienFromNY;

public class AlienAdapter extends Alien {

	private AlienFromNY alienFromNY;

	public AlienAdapter(AlienFromNY alienNY) {
		this.alienFromNY = alienNY;
		erdeBesuchverhalten = new ErdeZerstoererischAdapter();
	}
	
	@Override
	public void darstellen() {
		alienFromNY.show();
	}

	@Override
	public void fliegen() {
		alienFromNY.fly();
	}
}
