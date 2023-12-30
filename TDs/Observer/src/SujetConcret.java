public class SujetConcret extends Sujet {
    private String etat;

    public String getEtat() {
        return etat;
    }

    public void setEtat(String nouvelEtat) {
        this.etat = nouvelEtat;
        notifierObservateurs();
    }
}
