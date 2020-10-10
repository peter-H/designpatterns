package putzroboter.zustaende;

import putzroboter.Putzroboter;

public class FahrendZustand extends Zustand {
    public FahrendZustand(Putzroboter putzroboter) {
        super(putzroboter);
    }

    public void befehlStoppen() {
        System.out.println("FahrendZustand: Stoppen");
        exit();
        putzroboter.stoppen();
        putzroboter.setAktuellerZustand(putzroboter.getGestopptZustand());
        putzroboter.getAktuellerZustand().entry();
    }

    public void onKollision() {
        System.out.println("FahrendZustand: Kollision");
        putzroboter.rangieren();
        putzroboter.setAktuellerZustand(putzroboter.getRangierendZustand());
    }

    public void entry() {
        putzroboter.saugerEin();
    }

    public void exit() {
        putzroboter.saugerAus();
    }
}
