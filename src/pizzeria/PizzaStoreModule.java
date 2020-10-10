package pizzeria;

import com.google.inject.AbstractModule;

public class PizzaStoreModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PizzaStore.class)
			//.to(ChicagoPizzaStore.class);
			.to(NYPizzaStore.class);
	}
}
