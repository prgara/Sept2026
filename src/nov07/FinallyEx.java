package nov07;

import java.util.Scanner;

public class FinallyEx {
    public static void main(String[] args) {
        System.out.println("DB connection opened");
        String s = null;
        try {

            System.out.println(s.toLowerCase());
        } catch (NullPointerException e){
            System.out.println("something went wrong");
        } finally {
            System.out.println("DB connection closed");
        }


        try{
            System.out.println("I m trying try with finally block");
        } finally {
            System.out.println("Finally gets executed");
        }


        try (Scanner sc = new Scanner(System.in)){

        }
    }
}
