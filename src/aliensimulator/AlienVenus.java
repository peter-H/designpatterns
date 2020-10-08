package aliensimulator;

public class AlienVenus extends Alien {
	
	public AlienVenus(){
		erdeBesuchverhalten = new ErdeFreundlichBesuchen();
	}

	public void darstellen() {
		System.out.println("Ich bin das Alien von der Venus.");
	}
}
