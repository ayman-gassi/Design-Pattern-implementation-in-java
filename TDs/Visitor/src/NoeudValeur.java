public class NoeudValeur implements Noeud{
    int valeur ;

    public NoeudValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
