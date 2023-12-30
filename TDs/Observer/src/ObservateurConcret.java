public class ObservateurConcret implements Observateur {
    private SujetConcret sujet;
    private String information;

    public ObservateurConcret(SujetConcret sujet) {
        this.sujet = sujet;
        this.sujet.ajouterObservateur(this);
    }

    @Override
    public void actualise() {
        information = sujet.getEtat();
        afficherEtat();
    }

    public void afficherEtat() {
        System.out.println("Nouvel état du véhicule : " + information);
    }
}
