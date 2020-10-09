package pizzeria;

public class NYPizzaStore {
	NYPizzaFactory factory;
 
	public NYPizzaStore(NYPizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		//pizza.box();
		nyBox(pizza);
		
		return pizza;
	}
	
	public void nyBox(Pizza pizza) {
		System.out.println("NY style boxing " + pizza.name);
	}
	
}
