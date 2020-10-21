package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.AlienKomponenten;
import aliensimulator.ufos.komponenten.AlienKomponentenFabrik;
import aliensimulator.ufos.komponenten.KomponentenFabrik;

import javax.inject.Inject;

public class AlienUfoFactory implements UfoFactory {

    @Inject
    private @AlienKomponenten KomponentenFabrik komponentenFabrik;

    public AlienUfoFactory() {
    }

    @Override
    public Ufo createUfo(String type) {
        Ufo ufo = null;

        switch (type) {
            case "sternenkreuzer" :
                ufo = new Sternenkreuzer(komponentenFabrik);
                ufo.setName("Alien Sternenkreuzer");
                ufo.herstellen();
                break;
            case "transportschiff" :
                ufo = new Transportschiff(komponentenFabrik);
                ufo.setName("Alien Transportschiff");
                ufo.herstellen();
                break;
        }
        return ufo;
    }
}
