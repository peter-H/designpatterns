package putzroboter;

public class PutzroboterTestDrive {

    public static void main(String[] args) {
        Putzroboter putzroboter = new Putzroboter();

        putzroboter.befehlEinschalten();
        putzroboter.befehlFahren();
        putzroboter.befehlStoppen();
        putzroboter.befehlDrehen();
        putzroboter.onKollision();
        putzroboter.befehlFahren();
        putzroboter.onHindernisUeberwunden();
        putzroboter.onKollision();
        putzroboter.befehlStoppen();
        putzroboter.befehlAusschalten();
    }
}
