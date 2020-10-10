package putzroboter.zustaende;

import putzroboter.Putzroboter;

public class RangierendZustand extends Zustand {
    public RangierendZustand(Putzroboter putzroboter) {
        super(putzroboter);
    }

    public void befehlStoppen() {
        System.out.println("RangierendZustand: Stoppen");
        putzroboter.setAktuellerZustand(putzroboter.getGestopptZustand());
        putzroboter.getAktuellerZustand().entry();
    }

    public void onHindernisUeberwunden() {
        System.out.println("RangierendZustand: Hindernis überwunden");
        putzroboter.fahren();
        putzroboter.setAktuellerZustand(putzroboter.getFahrendZustand());
        putzroboter.getAktuellerZustand().entry();
    }

    public void befehlDrehen() {
        System.out.println("RangierendZustand: Drehen nicht möglich");
    }

    public void befehlFahren() {
        System.out.println("RangierendZustand: Fahren nicht möglich");
    }
}
