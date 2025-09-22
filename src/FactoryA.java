public class FactoryA implements SmartDeviceFactory {
    
    // Brand A bulb creation
    @Override
    public Bulb createBulb() {
        return new BulbA();
    }

    // Brand A lock creation
    @Override
    public Lock createLock() {
        return new LockA();
    }
}