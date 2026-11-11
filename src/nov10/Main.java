package nov10;

public class Main {

   static int balance = 1000;

    public static void main(String[] args) {
       withdraw(1800);
    }


   static void withdraw(int amount) throws InsufficientFundException {
        if(amount > balance){
            throw new InsufficientFundException("Something went wrong");
        }
       System.out.println("Withdraw successfully");
    }
}
