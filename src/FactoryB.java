public class FactoryB implements SmartDeviceFactory {
    
    // Brand B bulb creation
    @Override
    public Bulb createBulb() {
        return new BulbB();
    }

    // Brand A lock creation
    @Override
    public Lock createLock() {
        return new LockB();
    }
}
