public class DieselEngine {
    private final float power;
    private final float fuelConsumption;
    private final float price;
    private final String sparkPlug;

    public DieselEngine(float power, float fuelConsumption, float price, String sparkPlug) {
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
        this.sparkPlug = sparkPlug;
    }

    public void run() {
        System.out.println("Diesel Engine is running");
        System.out.println("Power: " + power + " Fuel consumption: " + fuelConsumption + " Price: " + price);
        System.out.println("Spark plug name: " + sparkPlug);
    }
}
