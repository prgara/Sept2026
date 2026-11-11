package nov07;

import java.io.IOException;

public class Bank {

    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws RuntimeException{
        if ( balance < amount){
            throw new RuntimeException("Insufficient Fund");
        }
        balance = balance - amount;
        System.out.println("Withdraw proceess finished");
    }


    void deposit(double amount) throws IOException {
        if(amount <= 0){
            throw new RuntimeException("Amount cannot be negative");
        }
        balance = balance+ amount;
        System.out.println(balance);
    }
}
