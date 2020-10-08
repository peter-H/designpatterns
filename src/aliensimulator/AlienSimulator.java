package aliensimulator;

public class AlienSimulator {
	
	public static void main(String[] args) {

		Alien alien = new AlienMars();
		alien.darstellen();
		alien.fliegen();

		alien = new AlienMond();
		alien.darstellen();
		alien.fliegen();
	}
}
