package aliensimulator.ufos.komponenten;

public class AlienKomponentenFabrik implements KomponentenFabrik {
    @Override
    public Antrieb createAntrieb() {
        return new Hyperantrieb();
    }

    @Override
    public Schild createSchild() {
        return new Verteidigungsschild();
    }

    @Override
    public Waffe createWaffe() {
        return new Phaserkanone();
    }

}
