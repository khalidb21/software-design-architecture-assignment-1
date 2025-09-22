public class LockA extends Lock{
    
    // set battery consumption for Brand A lock
    @Override
    public void setBatteryConsumption(int battery) {
        this.lockBatteryConsumption = battery;
    }
    
}
