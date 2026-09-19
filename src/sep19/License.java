package sep19;

import java.util.Scanner;

public class License {

    public static void main(String[] args) {
        //data type              var/ref     assgn opt          value
        int                       age            =              18;
        //data type       var         asgn opt           value
        Scanner           scanner         =            new Scanner(System.in);
        System.out.println("Take type your age: ");
        int userInput = scanner.nextInt();

        if(userInput > 18){
            System.out.println("Eligible to drive");
        } else {
            System.out.println("Not eligible to drive");
        }
    }
}
