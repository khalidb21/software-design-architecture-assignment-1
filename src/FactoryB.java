public class FactoryB implements SmartDeviceFactory {
    
    // Simulate factory method pattern by providing usage values for devices
    private final float BULB_B_WATTAGE = 10.0f;
    private final int LOCK_B_BATTERY = 450;

    // Brand B bulb creation
    @Override
    public Bulb createBulb() {
        Bulb bulb = new BulbB();
        bulb.setPowerUsage(BULB_B_WATTAGE);
        return bulb;
    }

    // Brand B lock creation
    @Override
    public Lock createLock() {
        Lock lock = new LockB();
        lock.setBatteryConsumption(LOCK_B_BATTERY);
        return lock;
    }
}
