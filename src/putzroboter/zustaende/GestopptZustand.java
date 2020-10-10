package putzroboter.zustaende;

import putzroboter.Putzroboter;

public class GestopptZustand extends Zustand {
    public GestopptZustand(Putzroboter putzroboter) {
        super(putzroboter);
    }

    public void befehlFahren() {
        System.out.println("GestopptZustand: Fahren");
        exit();
        putzroboter.fahren();
        putzroboter.setAktuellerZustand(putzroboter.getFahrendZustand());
        putzroboter.getAktuellerZustand().entry();
    }

    public void befehlDrehen() {
        System.out.println("GestopptZustand: Drehen");
        putzroboter.drehen();
        putzroboter.setAktuellerZustand(putzroboter.getDrehendZustand());
    }

    public void befehlAusschalten() {
        System.out.println("GestopptZustand: Ausschalten");
        putzroboter.ausschalten();
    }

    public void entry() {
        putzroboter.motorAus();
    }

    public void exit() {
        putzroboter.motorEin();
    }
}
