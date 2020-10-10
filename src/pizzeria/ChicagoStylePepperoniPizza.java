package pizzeria;

public class ChicagoStylePepperoniPizza extends Pizza {

	static {
		ChicagoPizzaRegistry.register(new ChicagoStylePepperoniPizza());
	}

	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
		toppings.add("Sliced Pepperoni");
	}
 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public Boolean canHandle(String type) {
		return type.equalsIgnoreCase("pepperoni");
	}
}
