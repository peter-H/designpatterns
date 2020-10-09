package aliensimulator.predators;


public class PredatorFactory {

	public Predator createPredator(String type) {
    	if (type.equals("yautja")) {
    		return new Yautja();
	} else if (type.equals("hishquten")) {
	    	return new HishQuTen();
	} else return null;
	}
}
