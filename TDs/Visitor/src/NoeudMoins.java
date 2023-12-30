public class NoeudMoins implements Noeud{
    Noeud gauche ;
    Noeud droite ;

    public NoeudMoins(Noeud noeudGauche, Noeud noeudDroire) {
        gauche = noeudGauche;
        droite = noeudDroire;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroite() {
        return droite;
    }
}
