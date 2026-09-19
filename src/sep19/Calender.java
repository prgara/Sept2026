package sep19;

import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num from 1-7 : ");
        int day = sc.nextInt();

//        if(day == 1){
//            System.out.println("Today is Sunday");
//        } else if (day == 2){
//            System.out.println("Today is Monday");
//        }
//

        switch (day){
            case 1:
                System.out.println("Toady is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Your input is wrong. Choose b/w 1-7");
        }


    }
}
