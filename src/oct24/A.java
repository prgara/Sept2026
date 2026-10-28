package oct24;

public class A {
    A(){
        System.out.println("In  class A");
    }
    A(int x){
        System.out.println(x + " from class A");
    }
}

class B extends A{
    B(){
        super(7);
        System.out.println("In class B");
    }
    B(int x ) {
        super(5);
        System.out.println(x +" from class B");
    }

}


class Main{
    public static void main(String[] args) {
        B b = new B();

    }
}
