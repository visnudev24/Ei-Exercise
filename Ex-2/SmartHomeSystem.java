import java.util.*;

public class SmartHomeSystem {
    private Map<Integer, Device> devices = new HashMap<>();
    private List<String> schedules = new ArrayList<>();
    private List<String> triggers = new ArrayList<>();

    public void addDevice(int id, Device device) {
        devices.put(id, device);
    }

    public void turnOnDevice(int id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOn();
            notifyDevices();
        }
    }

    public void turnOffDevice(int id) {
        if (devices.containsKey(id)) {
            devices.get(id).turnOff();
            notifyDevices();
        }
    }

    public void setSchedule(int id, String time, String command) {
        schedules.add("Device: " + id + ", Time: " + time + ", Command: " + command);
    }

    public void addTrigger(String condition, String action) {
        triggers.add("Condition: " + condition + ", Action: " + action);
    }

    public void notifyDevices() {
        for (Device device : devices.values()) {
            // Notify each device (if needed, for simplicity we skip complex notification logic)
        }
    }

    public void printStatus() {
        for (Device device : devices.values()) {
            System.out.println(device.getStatus());
        }
    }

    public void printSchedules() {
        for (String schedule : schedules) {
            System.out.println(schedule);
        }
    }

    public void printTriggers() {
        for (String trigger : triggers) {
            System.out.println(trigger);
        }
    }
}