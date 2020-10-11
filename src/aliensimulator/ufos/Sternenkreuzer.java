package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.KomponentenFabrik;

public class Sternenkreuzer extends Ufo {

    public Sternenkreuzer(KomponentenFabrik komponentenFabrik) {
        super();
        setKomponentenFabrik(komponentenFabrik);
    }

    public void herstellen() {
        setAntrieb(komponentenFabrik.createAntrieb());
        setSchild(komponentenFabrik.createSchild());
        setWaffe(komponentenFabrik.createWaffe());
    }

    public String toString() {
        return "Sternenkreuzer\n" + super.toString();
    }
}
