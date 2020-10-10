package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ChicagoPizzaRegistry {
	static List<Pizza> pizzaHandlers = new ArrayList<>();
	
	static void register(Pizza pizza) {
		pizzaHandlers.add(pizza);
	}
	
	static Pizza getPizzaHandler(String type) {
		ListIterator<Pizza> iter = pizzaHandlers.listIterator();
		while (iter.hasNext()) {
			Pizza pizza = iter.next();
			if (pizza.canHandle(type)) {
				return pizza;
			}
		}
		return null;
	}
}
