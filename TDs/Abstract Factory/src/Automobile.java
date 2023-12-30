public abstract class Automobile {
    int model , puissance , espace ;
    String color ;

    public Automobile(int model, int puissance, int espace, String color) {
        this.model = model;
        this.puissance = puissance;
        this.espace = espace;
        this.color = color;
    }

    public abstract void AfficheCarac ( int m , int p , int e , String c) ;

}
