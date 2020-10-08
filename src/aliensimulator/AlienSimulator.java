package aliensimulator;

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
	}
}
