package aliensimulator.aliens;

import aliens_3rdparty.AlienFromNY;

public class AlienFactory  {

	public Alien createAlien(String type) {
    	if (type.equals("mars")) {
        		return new AlienMars();
    	} else if (type.equals("mond")) {
    	    	return new AlienMond();
    	} else if (type.equals("venus")) {
    	    	return new AlienVenus();
    	} else if (type.equals("ny")) {
        		return new AlienAdapter(new AlienFromNY());
    	} else return null;
}
}
