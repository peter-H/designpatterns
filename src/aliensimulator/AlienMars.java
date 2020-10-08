package aliensimulator;

public class AlienMars extends Alien implements ErdeFeindlichBesuchen {
	
	public void darstellen() {
		System.out.println("Ich bin das Alien vom Mars.");
	}

	public void erdeFeindlichBesuchen() { System.out.println("Ich besuche die Erde. Die Menschen schmecken gut.");
	}
}
