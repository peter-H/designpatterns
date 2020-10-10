package pizzeria;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		Pizza pizza = null;

		Properties properties = new Properties();
		try {
			properties.load(this.getClass().getResourceAsStream("nypizza.properties"));
			String pizzaName = properties.getProperty(item);
			Class<?> classOfPizza = Class.forName(pizzaName);
			Constructor<Pizza> constructor = (Constructor<Pizza>) classOfPizza.getConstructor(new Class[]{});
			pizza = constructor.newInstance();
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException |
				NoSuchMethodException | InvocationTargetException e) {
			e.printStackTrace();
		}
		return pizza;
	}
}
