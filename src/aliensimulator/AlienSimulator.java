package aliensimulator;

public class AlienSimulator {
	
	public static void main(String[] args) {

		AlienMars alienMars = new AlienMars();
		alienMars.darstellen();
		alienMars.fliegen();
		alienMars.erdeFeindlichBesuchen();

		AlienMond alienMond = new AlienMond();
		alienMond.darstellen();
		alienMond.fliegen();
		alienMond.erdeFreundlichBesuchen();

		AlienVenus alienVenus = new AlienVenus();
		alienVenus.darstellen();
		alienVenus.fliegen();
		alienVenus.erdeFreundlichBesuchen();
	}
}
