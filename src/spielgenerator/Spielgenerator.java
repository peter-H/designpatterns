package spielgenerator;

import gebaeude.Gebaeude;
import gelaende.Gelaende;
import monster.Monster;

public interface Spielgenerator {
	
	public Monster createKreatur();
	public Gebaeude createGebaeude();
	public Gelaende createGelaende();

}
