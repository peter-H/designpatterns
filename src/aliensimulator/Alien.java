package aliensimulator;

public abstract class Alien {
	
	public abstract void darstellen();

	public void fliegen() {
		System.out.println("Ich fliege durch den Weltraum.");
	}

	public void erdeBesuchen(){
		System.out.println("Ich besuche die Erde. Die Menschen sind wundervoll.");
	}
}
