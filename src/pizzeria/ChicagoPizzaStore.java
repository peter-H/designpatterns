package pizzeria;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		Pizza pizza = null;

		pizza = ChicagoPizzaRegistry.getPizzaHandler(item);
		if (pizza == null) {
			System.out.println("Kein Handler gefunden");
		}

		return pizza;
	}
}
