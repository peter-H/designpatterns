package putzroboter.zustaende;

import putzroboter.Putzroboter;

public class AusZustand extends Zustand {
    public AusZustand(Putzroboter putzroboter) {
        super(putzroboter);
    }

    public void befehlEinschalten() {
        System.out.println("AusZustand: Einschalten");
        putzroboter.einschalten();
        putzroboter.setAktuellerZustand(putzroboter.getGestopptZustand());
        putzroboter.getAktuellerZustand().entry();
    }
}
