package aliensimulator;

public class AlienMond extends Alien {
	
	public AlienMond(){
		erdeBesuchverhalten = new ErdeFreundlichBesuchen();
	}
	
	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mond.");
	}
}
