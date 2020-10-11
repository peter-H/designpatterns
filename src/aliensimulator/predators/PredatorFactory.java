package aliensimulator.predators;


import java.io.IOException;
import java.util.Properties;

public class PredatorFactory {

	public Predator createPredator(String type) {
		Predator predator = null;
		Properties properties = new Properties();

		try {
			properties.load(this.getClass().getResourceAsStream("predator.properties"));
			String className = properties.getProperty(type);
			Class<?> classOfPredator = Class.forName(className);
			predator = (Predator) classOfPredator.newInstance();
		} catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return predator;
	}
}
