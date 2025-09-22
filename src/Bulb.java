public abstract class Bulb {
    
    // store wattage of bulb
    protected float bulbWattage;

    // abstract method to set power usage
    public abstract void setPowerUsage(float wattag);

    // getter method to return power usage
    public float getPowerUsage() {
        return bulbWattage;
    }

}