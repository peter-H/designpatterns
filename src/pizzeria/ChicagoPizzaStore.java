package pizzeria;

public class ChicagoPizzaStore {
	ChicagoPizzaFactory factory;
 
	public ChicagoPizzaStore(ChicagoPizzaFactory factory) {
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		//pizza.cut();
		pizza.box();

		return pizza;
	}
}
