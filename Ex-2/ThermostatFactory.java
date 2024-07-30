public class ThermostatFactory extends DeviceFactory {
    @Override
    public Device createDevice(int id) {
        return new Thermostat(id);
    }
}