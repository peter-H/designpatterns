package aliensimulator;

import aliens_3rdparty.AlienFromNY;
import aliens_3rdparty.NeutralBesuchen;
import aliensimulator.aliens.*;
import aliensimulator.predators.Predator;
import aliensimulator.predators.PredatorFactory;
import aliensimulator.predators.Yautja;
import aliensimulator.verhalten.ErdeFreundlichBesuchen;
import aliensimulator.verhalten.ErdeNeutralAdapter;

public class AlienSimulator {
	
	public static void main(String[] args) {
		AlienFactory alienFactory = new AlienFactory();

		Alien alienMars = alienFactory.createAlien("mars");
		alienMars.darstellen();
		alienMars.fliegen();

		// Änderung zur Laufzeit des Verhaltens des Aliens vom Mars
		System.out.println("Verhalten vom Alien vom Mars VOR der Änderung seines Verhaltens:");
		alienMars.erdeBesuchen();
		System.out.println("Verhalten vom Alien vom Mars NACH der Änderung seines Verhaltens:");
		alienMars.setErdeBesuchverhalten(new ErdeFreundlichBesuchen());
		alienMars.erdeBesuchen();

		Alien alienMond = alienFactory.createAlien("mond");
		alienMond.darstellen();
		alienMond.fliegen();
		alienMond.erdeBesuchen();

		Alien alienVenus = alienFactory.createAlien("venus");
		alienVenus.darstellen();
		alienVenus.fliegen();
		alienVenus.erdeBesuchen();

		Alien alienFromNY = alienFactory.createAlien("ny");
		alienFromNY.darstellen();
		alienFromNY.fliegen();
		System.out.println("Verhalten vom Alien von NY VOR der Änderung seines Verhaltens:");
		alienFromNY.erdeBesuchen();
		alienFromNY.setErdeBesuchverhalten(new ErdeNeutralAdapter(new NeutralBesuchen()));
		System.out.println("Verhalten vom Alien von NY NACH der Änderung seines Verhaltens:");
		alienFromNY.erdeBesuchen();

		PredatorFactory predatorFactory = new PredatorFactory();

		Predator yautja = predatorFactory.createPredator("yautja");
		yautja.darstellen();
		yautja.fliegen();
		yautja.erdeBesuchen();

	}
}
