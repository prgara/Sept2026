package oct31;

public class BankMAin {

    public static void main(String[] args) {
        BAnkAccount account = new BAnkAccount("Hary",9000);
        System.out.println(account.getName()); // Hary
        account.setName("Harry");
        System.out.println(account.getName()); // Harry
        System.out.println(account);

        System.out.println(account.deposit(1000));
        System.out.println(account.withdraw(12000));





    }

    void processPayment(String type, double amount){
        if(type.equals("CREDIT")){
            // payment logic 20 lines
        } else if (type.equals("DEBIT")) {
            // debit payment logic 40 lines
        }
    }


    public static class LoginMain {

        public static void main(String[] args) {
            FullTimeStudent.Login login = new FullTimeStudent.Login("Harry","Harry123");
        }
    }
}
