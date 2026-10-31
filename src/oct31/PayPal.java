package oct31;

public class PayPal extends Payment{

    public PayPal(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Pay using paypal");
    }
}
