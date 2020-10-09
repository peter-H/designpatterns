package pizzeria;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		NYPizzaFactory nyFactory = new NYPizzaFactory();
		NYPizzaStore nyStore = new NYPizzaStore(nyFactory);

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
		ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore(chicagoFactory);
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");

	}
}
