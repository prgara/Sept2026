package oct31;

public class DebitCard extends Payment{
    public DebitCard(int amount) {
        super(amount);
    }

    void pay(){
        System.out.println("Pay using debit card");
    }
}
