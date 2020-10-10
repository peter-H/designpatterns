package pizzeria;

public class TestPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new TestCheesePizza();
		} else if (item.equals("veggie")) {
			return new TestVeggiePizza();
		} else return null;
	}
	
	
}
