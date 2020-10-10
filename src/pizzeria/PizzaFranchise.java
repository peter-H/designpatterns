package pizzeria;

import com.google.inject.Inject;

public class PizzaFranchise {
	protected PizzaStore store;

	@Inject
	public void setStore(PizzaStore store) {
		this.store = store;
	}

	public Pizza orderPizza(String type) {
		return store.orderPizza(type);
	}
}
