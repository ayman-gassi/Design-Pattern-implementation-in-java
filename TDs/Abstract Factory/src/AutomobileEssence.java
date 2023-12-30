public class AutomobileEssence extends Automobile {
    AutomobileEssence( int m , int p , int e , String c ){
        super(m , p , e , c );
    }
    @Override
    public void AfficheCarac( int m , int p , int e , String c) {
        System.out.println(" " + m + " " + p + " " + e + " " + c );
    }
}
