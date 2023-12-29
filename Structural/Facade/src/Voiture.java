class Voiture {
    private final Moteur moteur;
    private final Freins freins;
    private final Lumiere lumieres;

    public Voiture() {
        this.moteur = new Moteur();
        this.freins = new Freins();
        this.lumieres = new Lumiere();
    }

    public void demarrer() {
        moteur.démarrer();
        lumieres.allumerPhares();
        freins.serrer();
    }

    public void arreter() {
        moteur.arrêter();
        lumieres.éteindrePhares();
        freins.relâcher();
    }
}