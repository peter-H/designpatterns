package pizzeria;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore[] storeList = {new TestPizzaStore(), new NYPizzaStore(), new ChicagoPizzaStore()};
		String[] customerList = {"Ethan", "Joel", "Martha"}; 
		String[] pizzaType = {"cheese", "veggie"};
		
		for (int i=0; i<storeList.length; i++) {
			PizzaFranchise franchise = new PizzaFranchise(storeList[i]);
				
			for (int j=0; j<pizzaType.length; j++) {
				Pizza pizza = franchise.orderPizza(pizzaType[j]);
				System.out.println(customerList[i] + " ordered a " + pizza.getName() + "\n");
			}
		}
	}
}
