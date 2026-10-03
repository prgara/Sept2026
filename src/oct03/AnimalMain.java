package oct03;

public class AnimalMain {
    public static void main(String[] args) {
        Animal lion = new Animal("Mufasa","Brown",true);
//        lion.name = "Mufasa";
//        lion.color = "Brown";
//        lion.carnivorous = true;

        lion.makeSound();
        lion.run("Lion");
        lion.printDetails();
        System.out.println("No. of legs "+lion.noOfLegs(4)); // argument


        System.out.println("=========");

        Animal dog = new Animal("Tommy","Black",false);
//        dog.name = "Tommy";
//        dog.color = "black";
//        dog.carnivorous = true;
        dog.makeSound();
        dog.run("Dog");
        dog.printDetails();
        System.out.println("No. of legs "+dog.noOfLegs(3));


        Animal deer = new Animal();



    }
}
