package aliensimulator;

public class AlienMars extends Alien {
	
	public AlienMars(){
		erdeBesuchverhalten = new ErdeFeindlichBesuchen();
	}

	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mars.");
	}
}
