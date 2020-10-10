package wetterstation;

import java.util.Observable;

public class EigenschaftenSubjekt extends Observable {
	public void firePropertyChange(WetterDaten wetterDaten) {
		setChanged();
		notifyObservers(wetterDaten);
	}

}
