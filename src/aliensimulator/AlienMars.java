package aliensimulator;

public class AlienMars extends Alien {

    public void darstellen() {
        System.out.println("Ich bin das Alien vom Mars.");
    }

    @Override
    public void erdeBesuchen() {
        System.out.println("Ich besuche die Erde. Die Menschen schmecken gut.");
    }
}
