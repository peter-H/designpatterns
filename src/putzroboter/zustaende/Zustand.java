package putzroboter.zustaende;

import putzroboter.Putzroboter;

public abstract class Zustand {
    public Putzroboter putzroboter;

    public Zustand(Putzroboter putzroboter) {
        this.putzroboter = putzroboter;
    }

    public void befehlEinschalten() {};
    public void befehlAusschalten() {};
    public void befehlFahren() {};
    public void befehlStoppen() {};
    public void befehlDrehen() {};
    public void onKollision() {};
    public void onHindernisUeberwunden() {};
    public void entry() {};
    public void exit() {};
}
