package pizzeria;

public class ChicagoStyleCheesePizza extends Pizza {

	static {
		ChicagoPizzaRegistry.register(new ChicagoStyleCheesePizza());
	}

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public Boolean canHandle(String type) {
		return type.equalsIgnoreCase("cheese");
	}
}
