package sep19;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int a = 25;
        int b = 10;

        System.out.println(x==a && a!=b || x < a); // T
        System.out.println(x==a && x!=b && y < x); // F
        System.out.println(!(y < a || b!=a ));    // F  20 < 25 --- !T ---F
        System.out.println(b>x && !(b<a) );       // F
        System.out.println(y !=y || a!=b);        //  T
        System.out.println(b ==b && !(a!=b));    //  F

/*
        stmt1                 stmt2              res
        y < a                  b!=a
        20 < 25                 10!=25
           T                    T                  T

           !T ==== F
 */






    }

}
