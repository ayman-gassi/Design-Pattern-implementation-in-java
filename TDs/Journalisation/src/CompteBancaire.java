public class CompteBancaire {
    private int numero;
    private double solde;

    public CompteBancaire(int numero) {
        this.numero = numero;
        this.solde = 0;
    }

    public void deposerArgent(double montant) {
        solde += montant;
        Journalisation.getInstance().ajouterLog("Dépôt de " + montant + " DA sur le compte numéro " + numero + ". Nouveau solde : " + solde + " DA.");
    }

    public void retirerArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            Journalisation.getInstance().ajouterLog("Retrait de " + montant + " DA sur le compte numéro " + numero + ". Nouveau solde : " + solde + " DA.");
        } else {
            Journalisation.getInstance().ajouterLog("Opération de retrait échouée. Solde insuffisant sur le compte numéro " + numero + ".");
        }
    }
}