package nov03;

public interface Engine {
    void start();
}

class DieselEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Diesel engine started");
    }
}

class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class HydrogenEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Hydrogen engine strated");
    }
}

class Truck {

    Engine engine;

    public Truck(Engine engine) {
        this.engine = engine;
    }

    void drive(){
        engine.start();
        System.out.println("Truck is moving");
    }

}

class TruckMain{
    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Engine dieselEngine = new DieselEngine();
        Engine hydrogenEngine = new HydrogenEngine();



        Truck truck = new Truck(hydrogenEngine);
        truck.drive();
    }
}