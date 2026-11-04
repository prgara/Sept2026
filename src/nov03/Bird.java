package nov03;

public class Bird implements Flyable, LivingBeing {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void breathe() {
        System.out.println("Duck is a living being");
    }
}
