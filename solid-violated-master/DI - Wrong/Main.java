public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a car");
        PetrolEngine petrolEngine = new PetrolEngine(107.2f, 20.4f, 7372.50f);
        Car car = new Car(petrolEngine);
        System.out.println("Starting a car");
        car.start();
    }
}
