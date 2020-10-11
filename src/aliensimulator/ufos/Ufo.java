package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.Antrieb;
import aliensimulator.ufos.komponenten.KomponentenFabrik;
import aliensimulator.ufos.komponenten.Schild;
import aliensimulator.ufos.komponenten.Waffe;

public abstract class Ufo {
    KomponentenFabrik komponentenFabrik;
    String name;
    Antrieb antrieb;
    Schild schild;
    Waffe waffe;

    public abstract void herstellen();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }

    public Schild getSchild() {
        return schild;
    }

    public void setSchild(Schild schild) {
        this.schild = schild;
    }

    public Waffe getWaffe() {
        return waffe;
    }

    public void setWaffe(Waffe waffe) {
        this.waffe = waffe;
    }

    public KomponentenFabrik getKomponentenFabrik() {
        return komponentenFabrik;
    }

    public void setKomponentenFabrik(KomponentenFabrik komponentenFabrik) {
        this.komponentenFabrik = komponentenFabrik;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Name: " + name + "\n");

        if (antrieb != null) {
            result.append(antrieb + "\n");
        }

        if (schild != null) {
            result.append(schild + "\n");
        }

        if (waffe != null) {
            result.append(waffe + "\n");
        }

        return result.toString();
    }
}
