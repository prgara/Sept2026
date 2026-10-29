package oct27;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();


        Cat cat = new Cat();
        cat.sound();


        Animal simba = new Dog(); // upcasting --- object is of child class & ref is of parent class
        simba.sound();

        Animal[] animals = {new Dog(), new Cat(), new Lion()};

        Student ram = new Student("Ram",28);

        System.out.println(ram);

        String s = "Ram";
        System.out.println(s);



        Bank deepak = new Bank("Deepak", 999999.0);
        deepak.balance = -10.0;
        deepak.balance = 999999999999999999999.0;
        deepak.balance = 0.0;



    }
}
