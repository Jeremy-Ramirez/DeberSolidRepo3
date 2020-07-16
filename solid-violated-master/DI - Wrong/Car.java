public class Car {
    private final PetrolEngine engine;

    public Car(PetrolEngine petrolEngine) {
        engine = petrolEngine;
    }

    public void start() {
        System.out.println("Car is starting");
        engine.run();
    }
}
