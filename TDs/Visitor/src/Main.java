public class Main {
    public static void main(String[] args) {
        // (8 + 2) + (3 + 3)
        Noeud arbre = new NoeudPlus(
                new NoeudPlus(new NoeudValeur(8), new NoeudValeur(2)),
                new NoeudPlus(new NoeudValeur(3), new NoeudValeur(3))
        );

        System.out.println(" ");
        NoeudAffichage.afficher(arbre);

        int resultat = NoeudOperation.calcul(arbre);
        System.out.println("Result =  " + resultat);

    }
}