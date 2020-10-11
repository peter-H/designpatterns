package aliensimulator.predators;

public class PredatorFactory {

	public Predator createPredator(String type) {
		Predator predator = null;

		predator = PredatorRegistry.getPredatorHandler(type);
		if (predator == null) {
			System.out.println("Kein Handler gefunden");
		}

		return predator;
	}
}
