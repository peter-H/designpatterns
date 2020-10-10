package putzroboter.zustaende;

import putzroboter.Putzroboter;

public class DrehendZustand extends Zustand {
    public DrehendZustand(Putzroboter putzroboter) {
        super(putzroboter);
    }

    public void befehlStoppen() {
        System.out.println("DrehendZustand: Stoppen");
        putzroboter.stoppen();
        putzroboter.setAktuellerZustand(putzroboter.getGestopptZustand());
        putzroboter.getAktuellerZustand().entry();
    }

    public void onKollision() {
        System.out.println("DrehendZustand: Kollision");
        putzroboter.rangieren();
        putzroboter.setAktuellerZustand(putzroboter.getRangierendZustand());
    }

}
