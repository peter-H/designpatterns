package pizzeria;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PizzaTestDrive {

	public static void main(String[] args) {
		String[] pizzaType = { "cheese", "clam", "pepperoni", "veggie" };

		Injector i = Guice.createInjector(new PizzaStoreModule());
		PizzaFranchise franchise = i.getInstance(PizzaFranchise.class);

		for (int j = 0; j < pizzaType.length; j++) {
			Pizza pizza = franchise.orderPizza(pizzaType[j]);
			System.out.println("Customer ordered a " + pizza.getName() + "\n");
		}
	}
}
