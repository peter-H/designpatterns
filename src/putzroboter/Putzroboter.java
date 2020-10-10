package putzroboter;

import putzroboter.zustaende.*;

public class Putzroboter {
    Zustand ausZustand;
    Zustand gestopptZustand;
    Zustand fahrendZustand;
    Zustand drehendZustand;
    Zustand rangierendZustand;
    Zustand aktuellerZustand;

    public Putzroboter() {
        ausZustand = new AusZustand(this);
        gestopptZustand = new GestopptZustand(this);
        fahrendZustand = new FahrendZustand(this);
        drehendZustand = new DrehendZustand(this);
        rangierendZustand = new RangierendZustand(this);
        aktuellerZustand = ausZustand;
    }

    public Zustand getAusZustand() {
        return ausZustand;
    }

    public Zustand getGestopptZustand() {
        return gestopptZustand;
    }

    public Zustand getFahrendZustand() {
        return fahrendZustand;
    }

    public Zustand getDrehendZustand() {
        return drehendZustand;
    }

    public Zustand getRangierendZustand() {
        return rangierendZustand;
    }

    public Zustand getAktuellerZustand() {
        return aktuellerZustand;
    }

    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }

    public void befehlEinschalten() {
        aktuellerZustand.befehlEinschalten();
    };

    public void befehlAusschalten() {
        aktuellerZustand.befehlAusschalten();
    };

    public void befehlFahren() {
        aktuellerZustand.befehlFahren();
    };

    public void befehlStoppen() {
        aktuellerZustand.befehlStoppen();
    };

    public void befehlDrehen() {
        aktuellerZustand.befehlDrehen();
    };

    public void onKollision() {
        aktuellerZustand.onKollision();
    };

    public void onHindernisUeberwunden() {
        aktuellerZustand.onHindernisUeberwunden();
    };

    public void einschalten() {
        System.out.println("Putzroboter wird eingeschaltet");
    }

    public void ausschalten() {
        System.out.println("Putzroboter wird ausgeschaltet");
    }

    public void drehen() {
        System.out.println("Putzroboter dreht sich");
    }

    public void stoppen() {
        System.out.println("Putzroboter stoppt");
    }

    public void fahren(){
        System.out.println("Putzroboter fährt los");
    }

    public void rangieren() {
        System.out.println("Putzroboter rangiert");
    }

    public void motorEin() {
        System.out.println("Putzroboter schaltet Motor ein");
    }

    public void motorAus() {
        System.out.println("Putzroboter schaltet Motor aus");
    }

    public void saugerEin() {
        System.out.println("Putzroboter schaltet Sauger ein");
    }

    public void saugerAus() {
        System.out.println("Putzroboter schaltet Sauger aus");
    }
}
