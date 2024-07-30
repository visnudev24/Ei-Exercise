public class DoorLockFactory extends DeviceFactory {
    @Override
    public Device createDevice(int id) {
        return new DoorLock(id);
    }
}