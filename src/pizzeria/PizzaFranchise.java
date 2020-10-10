package pizzeria;

import com.google.inject.Inject;

public class PizzaFranchise {
	@Inject
	private PizzaStore store;

	public Pizza orderPizza(String type) {
		return store.orderPizza(type);
	}
}
