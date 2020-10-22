package aliensimulator.ufos.komponenten;

import aliensimulator.ufos.Sternenkreuzer;
import aliensimulator.ufos.Transportschiff;
import aliensimulator.ufos.Ufo;
import aliensimulator.ufos.UfoFactory;


public class AlienUfoFactory implements UfoFactory {

    private KomponentenFabrik komponentenFabrik;

    public AlienUfoFactory(KomponentenFabrik komponentenFabrik) {
        this.komponentenFabrik = komponentenFabrik;
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
