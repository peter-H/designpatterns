package aliensimulator;

public class AlienMond extends Alien implements ErdeFreundlichBesuchen {
	
	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mond.");
	}

	public void erdeFreundlichBesuchen() {
		System.out.println("Ich besuche die Erde. Die Menschen sind wundervoll.");
	}

}
