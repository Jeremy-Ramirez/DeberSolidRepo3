public class PetrolEngine {
    private final float power;
    private final float fuelConsumption;
    private final float price;

    public PetrolEngine(float power, float fuelConsumption, float price) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public void run() {
        System.out.println("Petrol Engine is running");
        System.out.println("Power: " + power + " Fuel consumption: " + fuelConsumption + " Price: " + price);
    }
}
