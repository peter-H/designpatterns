package aliensimulator.ufos.komponenten;

import aliensimulator.ufos.Sternenkreuzer;
import aliensimulator.ufos.Transportschiff;
import aliensimulator.ufos.Ufo;
import aliensimulator.ufos.UfoFactory;


public class PredatorUfoFactory implements UfoFactory {

    private KomponentenFabrik komponentenFabrik;

    public PredatorUfoFactory(KomponentenFabrik komponentenFabrik) {
        this.komponentenFabrik = komponentenFabrik;
    }

    @Override
    public Ufo createUfo(String type) {
        Ufo ufo = null;

        switch (type) {
            case "sternenkreuzer" :
                ufo = new Sternenkreuzer(komponentenFabrik);
                ufo.setName("Predator Sternenkreuzer");
                ufo.herstellen();
                break;
            case "transportschiff" :
                ufo = new Transportschiff(komponentenFabrik);
                ufo.setName("Predator Transportschiff");
                ufo.herstellen();
                break;
        }
        return ufo;
    }
}
