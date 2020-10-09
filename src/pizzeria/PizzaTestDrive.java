package pizzeria;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore();

		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");

	}
}
