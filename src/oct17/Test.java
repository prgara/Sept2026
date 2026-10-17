package oct17;

public class Test {

   static int a = 10; // 13


    public Test() {
        System.out.println(a); // 12
        a++; // 13
    }


   void display(){
        System.out.println("Static method demo");
    }



    static {
        System.out.println("Triggered static block");
    }

    {
        System.out.println("Instance block called");
    }



}
