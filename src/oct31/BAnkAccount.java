package oct31;

public class BAnkAccount {

   private String name;
   private double balance;

    public BAnkAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String deposit(double amount){
        if(amount < 0){
            System.out.println("Balance should be greater than zero");
        } else {
            balance = balance + amount;
        }
        return "Your new balance after deposit is :" + balance;
    }

    public String withdraw(double amount){
        if(amount > balance){
            System.out.println("Amount should be equals or less than your balance");
        }else {
            balance = balance - amount;
        }
        return "Your new balance after withdraw is :" + balance;
    }

    @Override
    public String toString() {
        return "BAnkAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
