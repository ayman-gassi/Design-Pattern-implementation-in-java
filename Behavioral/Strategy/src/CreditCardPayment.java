public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expirationDate;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cvv, String expirationDate, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card");
    }
}