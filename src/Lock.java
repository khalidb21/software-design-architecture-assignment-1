public abstract class Lock {
    
    // store battery consumption in 
    protected int lockBatteryConsumption;
    
    // abstract method to set battery consumption 
    public abstract void setBatteryConsumption(int battery);

    // getter method to return battery consumption 
    public float getBatteryConsumption() {
        return lockBatteryConsumption;
    }
} 
