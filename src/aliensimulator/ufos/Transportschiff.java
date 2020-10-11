package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.KomponentenFabrik;

public class Transportschiff extends Ufo {

    public Transportschiff(KomponentenFabrik komponentenFabrik) {
        super();
        setKomponentenFabrik(komponentenFabrik);
    }

    public void herstellen() {
        setAntrieb(komponentenFabrik.createAntrieb());
        setSchild(komponentenFabrik.createSchild());
    }

    public String toString() {
        return "Transportschiff\n" + super.toString();
    }
}
