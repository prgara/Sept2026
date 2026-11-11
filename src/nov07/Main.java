package nov07;

import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        String s = null;
        try {

            System.out.println(s.toString());
             int x = 10/0;
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("There is no such index");
        } catch (NullPointerException e){
            System.out.println("You are doin g operation on null object");
        } catch (ArithmeticException e){
            System.out.println("You are diving by 0 which is not allowed");
        } catch (RuntimeException e){

        }
       // int x = 10/0;
        System.out.println("Program finished");


    }
}
