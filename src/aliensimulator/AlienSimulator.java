package aliensimulator;

import aliens_3rdparty.AlienFromNY;
import aliens_3rdparty.NeutralBesuchen;

public class AlienSimulator {
	
	public static void main(String[] args) {
		Alien alienMars = new AlienMars();
		alienMars.darstellen();
		alienMars.fliegen();

		// Änderung zur Laufzeit des Verhaltens des Aliens vom Mars
		System.out.println("Verhalten vom Alien vom Mars VOR der Änderung seines Verhaltens:");
		alienMars.erdeBesuchen();
		System.out.println("Verhalten vom Alien vom Mars NACH der Änderung seines Verhaltens:");
		alienMars.setErdeBesuchverhalten(new ErdeFreundlichBesuchen());
		alienMars.erdeBesuchen();

		Alien alienMond = new AlienMond();
		alienMond.darstellen();
		alienMond.fliegen();
		alienMond.erdeBesuchen();

		Alien alienVenus = new AlienVenus();
		alienVenus.darstellen();
		alienVenus.fliegen();
		alienVenus.erdeBesuchen();

		Alien alienFromNY = new AlienAdapter(new AlienFromNY());
		alienFromNY.darstellen();
		alienFromNY.fliegen();
		System.out.println("Verhalten vom Alien von NY VOR der Änderung seines Verhaltens:");
		alienFromNY.erdeBesuchen();
		alienFromNY.setErdeBesuchverhalten(new ErdeNeutralAdapter(new NeutralBesuchen()));
		System.out.println("Verhalten vom Alien von NY NACH der Änderung seines Verhaltens:");
		alienFromNY.erdeBesuchen();
	}
}
