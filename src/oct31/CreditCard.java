package oct31;

public  class CreditCard extends Payment{

    public CreditCard(int amount) {
        super(amount);
    }

    @Override
    void pay() {
        //20 lines of logic
        System.out.println("Pay using credit card");
    }
}
