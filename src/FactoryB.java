public class FactoryB implements SmartDeviceFactory {
    
    // Simulate factory method pattern by providing usage values for devices
    private final float BULBA_WATTAGE = 10.0f;
    private final int LOCKA_BATTERY = 450;

    // Brand B bulb creation
    @Override
    public Bulb createBulb() {
        Bulb bulb = new BulbB();
        bulb.setPowerUsage(BULBA_WATTAGE);
        return bulb;
    }

    // Brand B lock creation
    @Override
    public Lock createLock() {
        Lock lock = new LockB();
        lock.setBatteryConsumption(LOCKA_BATTERY);
        return lock;
    }
}
