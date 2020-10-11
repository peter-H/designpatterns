package aliensimulator.predators;

import aliensimulator.verhalten.ErdeBesuchverhalten;

public abstract class Predator {
    private ErdeBesuchverhalten erdeBesuchverhalten;

    public abstract void darstellen();

    public abstract Boolean canHandle(String type);

    public void fliegen() {
        System.out.println("Ich fliege durch den Weltraum.");
    }

    public void erdeBesuchen(){
        erdeBesuchverhalten.erdeBesuchen();
    }

    public ErdeBesuchverhalten getErdeBesuchverhalten() {
        return erdeBesuchverhalten;
    }

    public void setErdeBesuchverhalten(ErdeBesuchverhalten erdeBesuchverhalten) {
        this.erdeBesuchverhalten = erdeBesuchverhalten;
    }

}
