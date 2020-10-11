package aliensimulator;

import aliens_3rdparty.AlienFromNY;
import aliens_3rdparty.NeutralBesuchen;
import aliensimulator.aliens.*;
import aliensimulator.predators.Predator;
import aliensimulator.predators.PredatorFactory;
import aliensimulator.predators.Yautja;
import aliensimulator.ufos.*;
import aliensimulator.verhalten.ErdeFreundlichBesuchen;
import aliensimulator.verhalten.ErdeNeutralAdapter;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class AlienSimulator {
	
	public static void main(String[] args) {
		try {
			Class.forName("aliensimulator.predators.HishQuTen");
			Class.forName("aliensimulator.predators.Yautja");
		} catch (Exception e) {
			e.printStackTrace();
		}

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

		Injector i = Guice.createInjector(new KomponentenModul());

		UfoFactory alienUfoFactory = i.getInstance(AlienUfoFactory.class);
		Ufo alienSternenkreuzer = alienUfoFactory.createUfo("sternenkreuzer");
		System.out.println(alienSternenkreuzer);
		Ufo alienTransportschiff = alienUfoFactory.createUfo("transportschiff");
		System.out.println(alienTransportschiff);

		UfoFactory predatorUfoFactory = i.getInstance(PredatorUfoFactory.class);
		Ufo predatorSternenkreuzer = predatorUfoFactory.createUfo("sternenkreuzer");
		System.out.println(predatorSternenkreuzer);
		Ufo predatorTransportschiff = predatorUfoFactory.createUfo("transportschiff");
		System.out.println(predatorTransportschiff);
	}
}
