public class LightFactory extends DeviceFactory {
    @Override
    public Device createDevice(int id) {
        return new Light(id);
    }
}