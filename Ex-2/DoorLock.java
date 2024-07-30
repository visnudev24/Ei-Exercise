public class DoorLock implements Device {
    private int id;
    private boolean isLocked;

    public DoorLock(int id) {
        this.id = id;
        this.isLocked = true;
    }

    @Override
    public void turnOn() {
        isLocked = true;
    }

    @Override
    public void turnOff() {
        isLocked = false;
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }
}