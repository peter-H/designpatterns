package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.KomponentenFabrik;
import aliensimulator.ufos.komponenten.PredatorKomponentenFabrik;

public class PredatorUfoFactory implements UfoFactory {
    @Override
    public Ufo createUfo(String type) {
        Ufo ufo = null;
        KomponentenFabrik komponentenFabrik = new PredatorKomponentenFabrik();

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
