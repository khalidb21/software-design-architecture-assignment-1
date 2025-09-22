public class FactoryA implements SmartDeviceFactory {
    
    // Simulate factory method pattern by providing usage values for devices
    private final float BULB_A_WATTAGE = 20.0f;
    private final int LOCK_A_BATTERY = 350;
    
    // Brand A bulb creation
    @Override
    public Bulb createBulb() {
        Bulb bulb = new BulbA();
        bulb.setPowerUsage(BULB_A_WATTAGE);
        return bulb;
    }

    // Brand A lock creation
    @Override
    public Lock createLock() {
        Lock lock = new LockA();
        lock.setBatteryConsumption(LOCK_A_BATTERY);
        return lock;
    }
}