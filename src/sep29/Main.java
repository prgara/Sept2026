package sep29;


public class Main {

    public static void main(String[] args) {
       //data type        var/ref                       value
        int                 x             =              10;

        Student   john = new Student(); // creating an object, instantiation
        Student tom = new Student();

        john.name = "John";
        john.rollNo = 12;
        john.marks = 98;

        tom.name = "tom";
        tom.rollNo = 13;
        tom.marks = 99;

//        System.out.println(john.name);
//        System.out.println(john.rollNo);
//        System.out.println(john.marks);
        john.study();
        john.displayInfo();
        System.out.println("=================Printing Tom details ========");
//        System.out.println(tom.name);
//        System.out.println(tom.rollNo);
//        System.out.println(tom.marks);
        tom.study();
        tom.displayInfo();





    }
}
