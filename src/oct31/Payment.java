package oct31;

public abstract class Payment {
    int amount ;

    public Payment(int amount) {
        this.amount = amount;
    }

    void bill(){ // concrete
        System.out.println("Bill generated");
    }

    abstract void pay(); // abstract method


}
