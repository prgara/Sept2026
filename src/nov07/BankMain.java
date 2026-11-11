package nov07;

import java.io.IOException;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank(1000.0);

        try {

            bank.withdraw(20000);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{

            bank.deposit(0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
