package aliensimulator;

public class AlienVenus extends Alien implements ErdeFreundlichBesuchen {
	
	public void darstellen() {
		System.out.println("Ich bin das Alien von der Venus.");
	}

	public void erdeFreundlichBesuchen() {
		System.out.println("Ich besuche die Erde. Die Menschen sind wundervoll.");
	}
	
}
