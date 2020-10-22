package aliensimulator.ufos.komponenten;

public interface KomponentenFabrik {

    public Antrieb createAntrieb();
    public Schild createSchild();
    public Waffe createWaffe();
}

