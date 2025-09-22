public class FactoryTest {
    public static void main(String[] args) {

        System.out.println("\n");

        //EXAMPLE 1: FACTORY A BULB
        SmartDeviceFactory FactoryA = new FactoryA();
        Bulb BA = FactoryA.createBulb();
        System.out.println("Bulb power usage (watts): " + BA.getPowerUsage());

        System.out.println("\n");

        //EXAMPLE 2: FACTORY B LOCK
        SmartDeviceFactory FactoryB = new FactoryB();
        Lock LB = FactoryB.createLock();
        System.out.println("Lock battery consumption (mAh): " +LB.getBatteryConsumption());
    }
}
