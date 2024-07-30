public class Thermostat implements Device {
    private int id;
    private int temperature;

    public Thermostat(int id) {
        this.id = id;
        this.temperature = 70; // Default temperature
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        // Implementation if needed
    }

    @Override
    public void turnOff() {
        // Implementation if needed
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }
}