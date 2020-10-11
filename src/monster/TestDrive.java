package monster;

import com.google.inject.Guice;
import com.google.inject.Injector;
import gegenstaende.Hexenmaske;

public class TestDrive {

	public static void main(String[] args) {
//		Observer beobachter;
//		beobachter = new SchreckwertBeobachter();

		Monster kruemelmonster = new Kruemelmonster();
		kruemelmonster.darstellen();
//		kruemelmonster.addObserver(beobachter);
//		kruemelmonster.kommunizieren();
		System.out.println();
		
		Monster kobold = new Kobold();
		kobold.darstellen();
//		kobold.addObserver(beobachter);
//		kobold.kommunizieren();
		kobold.addGegenstand(new Hexenmaske());
		kobold.darstellen();
//		kobold.kommunizieren();
		System.out.println();
		
//		Geist poltergeist = new Poltergeist();
//		poltergeist.anzeigen();
//		System.out.println();
//		
//		Monster sumpfgeist = new GeistAdapter(new Sumpfgeist());
//		sumpfgeist.darstellen();
//		sumpfgeist.addObserver(beobachter);
//		sumpfgeist.kommunizieren();
//		sumpfgeist.addGegenstand(new Clownsnase());
//		sumpfgeist.darstellen();
//		sumpfgeist.kommunizieren();
//		System.out.println();
//		
//		Monsterfabrik fabrik = new SchrecklicheMonsterfabrik();
//		Monster drache = fabrik.createMonster("Drache");
//		drache.darstellen();
//		drache.kommunizieren();
//		System.out.println();
//
//		Monsterfabrik monsterFabrik = new Monsterfabrik();
//		Monster fabrikKobold = monsterFabrik.createMonster("Kobold");
//		fabrikKobold.darstellen();
//		fabrikKobold.kommunizieren();
//		System.out.println();
//		 
//		Monster fabrikSumpfgeist = new GeistAdapter(Geisterfabrik.createGeist(GeistTyp.SUMPFGEIST));
//		fabrikSumpfgeist.darstellen();
//		fabrikSumpfgeist.kommunizieren();
//		System.out.println();
//
//		Spielgenerator generator = new MonsterSpielGenerator();
//		Monster monsterSpielKreatur = generator.createKreatur();
//		Gebaeude monsterSpielGebaeude = generator.createGebaeude();
//		Gelaende monsterSpielGelaende = generator.createGelaende();
//		monsterSpielKreatur.darstellen();
//		monsterSpielGebaeude.darstellen();
//		monsterSpielGelaende.darstellen();
//		System.out.println();
//		
//		generator = new GeisterSpielGenerator();
//		Monster geisterSpielKreatur = generator.createKreatur();
//		Gebaeude geisterSpielGebaeude = generator.createGebaeude();
//		Gelaende geisterSpielGelaende = generator.createGelaende();
//		geisterSpielKreatur.darstellen();
//		geisterSpielGebaeude.darstellen();
//		geisterSpielGelaende.darstellen();
//		System.out.println();

//		Monster testMonster = new Drache();
//		testMonster.darstellen();
//		testMonster.addObserver(beobachter);
//		testMonster.kommunizieren();
//		testMonster.aufstehenEreignis(); // schlafen -> essen
//		testMonster.arbeitenEreignis();  // essen -> arbeiten
//		testMonster.ausruhenEreignis();  // arbeiten -> ausruhen
//		testMonster.schlafenEreignis();  // ausruhen -> schlafen
//		testMonster.aufstehenEreignis();
//		testMonster.hexeKommtEreignis();
//		testMonster.verletztEreignis();
//		testMonster.geheiltEreignis();
//		testMonster.hexeGehtEreignis();
//		System.out.println();

/*
		System.out.println("Konfigurierbare Fabrik");
		MonsterfabrikKonfigurierbar konfFabrik = new MonsterfabrikKonfigurierbar();
		Monster monster1 = konfFabrik.createMonster("Drache");
		monster1.darstellen();
		monster1.addObserver(beobachter);
		monster1.kommunizieren();
		System.out.println();

		System.out.println("Registratur");
		try {
			Class.forName("monster.monster.Sulley");
			Class.forName("monster.monster.Mike");
		} catch (Exception e) {
			e.printStackTrace();
		}

		MonsterRegistriert sulley = MonsterRegistry.getMonster("Sulley");
		if (sulley != null) {
			sulley.darstellen();
			sulley.addObserver(beobachter);
			sulley.kommunizieren();
			System.out.println();
		} else {
			System.out.println("Kein Handler gefunden");
		}

		System.out.println("Dependency Injection: Constructor Injection");
		Injector i = Guice.createInjector(new SpielgeneratorModul());
		Spielgenerator generator = i.getInstance(SpielgeneratorProvider.class).getSpielgenerator();
		Monster monster = generator.createKreatur();
		Gebaeude gebaeude = generator.createGebaeude();
		Gelaende gelaende = generator.createGelaende();
		monster.darstellen();
		gebaeude.darstellen();
		gelaende.darstellen();
		System.out.println();
*/

	}
}
