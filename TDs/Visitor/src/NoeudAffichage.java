public class NoeudAffichage implements Visitor {

    @Override
    public void visit(NoeudPlus noeud) {
        noeud.getGauche().accept(this);
        System.out.print("+ ");
        noeud.getDroite().accept(this);
    }

    @Override
    public void visit(NoeudMoins noeud) {
        noeud.getGauche().accept(this);
        System.out.print("- ");
        noeud.getDroite().accept(this);
    }

    @Override
    public void visit(NoeudValeur noeud) {
        System.out.print(noeud.getValeur() + " ");
    }
    public static void afficher(Noeud racine) {
        NoeudAffichage visiteur = new NoeudAffichage();
        racine.accept(visiteur);
        System.out.println();
    }
}



