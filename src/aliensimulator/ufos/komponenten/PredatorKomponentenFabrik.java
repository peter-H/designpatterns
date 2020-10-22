package aliensimulator.ufos.komponenten;

public class PredatorKomponentenFabrik implements KomponentenFabrik {
    @Override
    public Antrieb createAntrieb() {
        return new Warpantrieb();
    }

    @Override
    public Schild createSchild() {
        return new Metaphasenschild();
    }

    @Override
    public Waffe createWaffe() {
        return new Laserkanone();
    }
}
