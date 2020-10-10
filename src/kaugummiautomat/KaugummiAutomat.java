package kaugummiautomat;

public class KaugummiAutomat {
 
	Zustand ausverkauftZustand;
	Zustand keineMuenzeZustand;
	Zustand hatMuenzeZustand;
	Zustand verkauftZustand;
	Zustand gewinnZustand;
 
	Zustand zustand = ausverkauftZustand;
	int anzahl = 0;
 
	public KaugummiAutomat(int anzahlKugeln) {
		ausverkauftZustand = new AusverkauftZustand(this);
		keineMuenzeZustand = new KeineMuenzeZustand(this);
		hatMuenzeZustand = new HatMuenzeZustand(this);
		verkauftZustand = new VerkauftZustand(this);
		gewinnZustand = new GewinnZustand(this);

		this.anzahl = anzahlKugeln;
 		if (anzahlKugeln > 0) {
			zustand = keineMuenzeZustand;
		} 
	}
 
	public void muenzeEinwerfen() {
		zustand.muenzeEinwerfen();
	}
 
	public void muenzeAuswerfen() {
		zustand.muenzeAuswerfen();
	}
 
	public void griffDrehen() {
		zustand.griffDrehen();
		zustand.kugelAuswerfen();
	}

	void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}
 
	void kugelFreigeben() {
		System.out.println("Eine Kugel rollt aus dem Ausgabeschacht");
		if (anzahl != 0) {
			anzahl = anzahl - 1;
		}
	}
 
	int getAnzahl() {
		return anzahl;
	}
 
	void auffuellen(int anzahl) {
		this.anzahl = anzahl;
		zustand = keineMuenzeZustand;
	}

    public Zustand getZustand() {
        return zustand;
    }

    public Zustand getAusverkauftZustand() {
        return ausverkauftZustand;
    }

    public Zustand getKeineMuenzeZustand() {
        return keineMuenzeZustand;
    }

    public Zustand getHatMuenzeZustand() {
        return hatMuenzeZustand;
    }

    public Zustand getVerkauftZustand() {
        return verkauftZustand;
    }

    public Zustand getGewinnZustand() {
        return gewinnZustand;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nKaukugel & Co KG");
		result.append("\nJava-gest�tzter Kaugummi-Standautomat Modell Nr. 2005");
		result.append("\nBestand: " + anzahl + " Kaugummikugel");
		if (anzahl != 1) {
			result.append("n");
		}
		result.append("\n");
		result.append("Automat " + zustand + "\n");
		return result.toString();
	}
}
