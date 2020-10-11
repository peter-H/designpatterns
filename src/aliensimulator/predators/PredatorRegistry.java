package aliensimulator.predators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PredatorRegistry {
    static List<Predator> predatorHandlers = new ArrayList<Predator>();

    static void register(Predator predator) {
        predatorHandlers.add(predator);
    }

    static Predator getPredatorHandler(String type) {
        ListIterator<Predator> iter = predatorHandlers.listIterator();
        while (iter.hasNext()) {
            Predator predator = iter.next();
            if (predator.canHandle(type)) {
                return predator;
            }
        }
        return null;
    }

}
