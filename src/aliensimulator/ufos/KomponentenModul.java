package aliensimulator.ufos;

import aliensimulator.ufos.komponenten.*;
import com.google.inject.AbstractModule;

public class KomponentenModul extends AbstractModule {

    @Override
    protected void configure() {
        bind(KomponentenFabrik.class)
                .annotatedWith(AlienKomponenten.class)
                .to(AlienKomponentenFabrik.class);

        bind(KomponentenFabrik.class)
                .annotatedWith(PredatorKomponenten.class)
                .to(PredatorKomponentenFabrik.class);
    }
}

