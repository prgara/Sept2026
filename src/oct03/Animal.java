package oct03;

public class Animal {
    //Instance variables
    String name;
    String color;
    boolean carnivorous;

    // whatever value(args) is provided to constructor assign it to instance var


    public Animal(String name, String color, boolean carnivorous) {
        this.name = name;
        this.color = color;
        this.carnivorous = carnivorous;
    }

    public Animal() {
    }

    // create a makeSound method
    void makeSound(){
        System.out.println(name+ " makes sound");
    }

    void run(String name){
        System.out.println(name +" can run");
    }

    void printDetails(){
        System.out.println("Animal name is "+ name + "of color "+ color +" and is carnivorous ->"+ carnivorous );
    }

    int noOfLegs(int legs){ // paramater

        return legs;
    }

// java code ---- .class


}
