public class NoeudPlus implements Noeud{
    Noeud gauche ;
    Noeud droite ;

    public NoeudPlus(Noeud Gauche, Noeud Droire) {
        gauche = Gauche;
        droite = Droire;
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
