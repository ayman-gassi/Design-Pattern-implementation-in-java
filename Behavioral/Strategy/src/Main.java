
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234 5678 9012 3456", "123", "12/25", "John Doe"));
        cart.checkout(100);
        cart.setPaymentStrategy(new PayPalPayment("ayman@gmail.com", "ayman"));
        cart.checkout(200);
    }
}