package oct31;

public class PaymentMain {


    public static void main(String[] args) {
        Payment payment = new DebitCard(10);
        payment.pay();

    }
}
