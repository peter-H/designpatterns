package pizzeria;

public class ChicagoStyleVeggiePizza extends Pizza {

	static {
		ChicagoPizzaRegistry.register(new ChicagoStyleVeggiePizza());
	}

	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public Boolean canHandle(String type) {
		return type.equalsIgnoreCase("veggie");
	}

}
