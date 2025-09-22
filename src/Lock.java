public abstract class Lock {
    
    // store battery consumption in mAh
    protected int lockBatteryConsumption;
    
    // abstract method to set battery consumption 
    public abstract void setBatteryConsumption(int battery);

    // getter method to return battery consumption 
    public int getBatteryConsumption() {
        return lockBatteryConsumption;
    }
} 
