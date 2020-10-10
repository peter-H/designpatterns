package pizzeria;

import com.google.inject.Inject;

public class PizzaFranchise {
	private PizzaStore store;
	
	@Inject
	public PizzaFranchise(PizzaStore store) {
		this.store = store;
	}
	
	public Pizza orderPizza(String type) {
		return store.orderPizza(type);
	}
}
