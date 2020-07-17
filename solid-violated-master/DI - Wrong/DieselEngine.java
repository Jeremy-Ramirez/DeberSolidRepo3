public class DieselEngine extends TipoCombustion{
   
    private final String sparkPlug;

    public DieselEngine(float power, float fuelConsumption, float price, String sparkPlug) {
        
        super(power,fuelConsumption,price);
        this.sparkPlug = sparkPlug;
    }

    
    
    
    
    
    
    
    
    public void run() {
        System.out.println("Diesel Engine is running");
        System.out.println("Power: " + power + " Fuel consumption: " + fuelConsumption + " Price: " + price);
        System.out.println("Spark plug name: " + sparkPlug);
    }
}
