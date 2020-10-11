package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.KomponentenFabrik;
import aliensimulator.ufos.komponenten.PredatorKomponenten;
import aliensimulator.ufos.komponenten.PredatorKomponentenFabrik;

import javax.inject.Inject;

public class PredatorUfoFactory implements UfoFactory {

    @Inject
    private @PredatorKomponenten KomponentenFabrik komponentenFabrik;

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
