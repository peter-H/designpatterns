package pizzeria;

public class PizzaFranchise {
	private PizzaStore store;
	
	public PizzaFranchise(PizzaStore store) {
		this.store = store;
	}
	
	public Pizza orderPizza(String type) {
		return store.orderPizza(type);
	}
}
