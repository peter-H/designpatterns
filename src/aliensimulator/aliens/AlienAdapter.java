package aliensimulator.aliens;

import aliens_3rdparty.AlienFromNY;
import aliensimulator.verhalten.ErdeZerstoererischAdapter;

public class AlienAdapter extends Alien {

	private AlienFromNY alienFromNY;

	public AlienAdapter(AlienFromNY alienNY) {
		this.alienFromNY = alienNY;
		this.setErdeBesuchverhalten(new ErdeZerstoererischAdapter());
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
