public class LockB extends Lock{

    // set battery consumption for Brand B lock
    @Override
    public void setBatteryConsumption(int battery) {
        this.lockBatteryConsumption = battery;
    }

}
