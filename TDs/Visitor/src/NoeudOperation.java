public class NoeudOperation implements Visitor {
    private int Total ;

    @Override
    public void visit(NoeudPlus noeud) {
        noeud.getGauche().accept(this);
        int gauche = Total;
        noeud.getDroite().accept(this);
        int droit = Total;
        Total = gauche + droit;
    }

    @Override
    public void visit(NoeudMoins noeud) {
        noeud.getGauche().accept(this);
        int gauche = Total;
        noeud.getDroite().accept(this);
        int droit = Total;
        Total = gauche - droit;
    }

    @Override
    public void visit(NoeudValeur noeud) {
        Total = noeud.getValeur();
    }
    public static int calcul(Noeud racine) {
        NoeudOperation visiteur = new NoeudOperation();
        racine.accept(visiteur);
        return visiteur.Total;
    }
}
