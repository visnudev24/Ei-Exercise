public class Main {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();

        // Create factories
        DeviceFactory lightFactory = new LightFactory();
        DeviceFactory thermostatFactory = new ThermostatFactory();
        DeviceFactory doorLockFactory = new DoorLockFactory();

        // Add devices
        system.addDevice(1, new DeviceProxy(lightFactory.createDevice(1)));
        system.addDevice(2, new DeviceProxy(thermostatFactory.createDevice(2)));
        system.addDevice(3, new DeviceProxy(doorLockFactory.createDevice(3)));

        // Turn on light
        system.turnOnDevice(1);

        // Set schedule
        system.setSchedule(2, "06:00", "Turn On");

        // Add trigger
        system.addTrigger("temperature > 75", "turnOff(1)");

        // Print status
        system.printStatus();

        // Print schedules
        system.printSchedules();

        // Print triggers
        system.printTriggers();
    }
}