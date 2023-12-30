public interface Visitor {
    void visit(NoeudPlus noeud);
    void visit(NoeudMoins noeud);
    void visit(NoeudValeur noeud);
}
