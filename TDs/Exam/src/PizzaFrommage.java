import org.ietf.jgss.Oid;

public class PizzaFrommage implements Pizza {
    @Override
    public void Preparer() {
        System.out.println("Preparer Pizza Frommage");
    }

    @Override
    public void Cuire() {
        System.out.println("Cuire Pizza Frommage");
    }

    @Override
    public void Couper() {
        System.out.println("Couper Pizza Frommage");
    }

    @Override
    public void Emballer() {
        System.out.println("Emballer Pizza Frommage");
    }
}
