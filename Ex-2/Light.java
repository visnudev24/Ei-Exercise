public class Light implements Device {
    private int id;
    private boolean isOn;

    public Light(int id) {
        this.id = id;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + (isOn ? "On" : "Off");
    }
}
