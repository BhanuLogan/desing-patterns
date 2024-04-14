package patterns.bridge.model;

public class MobileRemote implements Remote {

    private Device device;

    public MobileRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
        String status = device.isEnabled() ? "ON" : "OFF";
        System.out.println("Mobile Remote - Successfully turned " + status + " device");
    }

    @Override
    public void volumeDown() {
        if(!device.isEnabled()) return ;
        device.setVolume(device.getVolume() - 1);
        System.out.println("Mobile Remote - Volume DOWN: " + device.getVolume());
    }

    @Override
    public void volumeUp() {
        if(!device.isEnabled()) return ;
        device.setVolume(device.getVolume() + 1);
        System.out.println("Mobile Remote - Volume UP: " + device.getVolume());
    }

    @Override
    public void channelDown() {
        if(!device.isEnabled()) return ;
        device.setChannel(device.getChannel() - 1);
        System.out.println("Mobile Remote - Channel DOWN: " + device.getChannel());
    }

    @Override
    public void channelUp() {
        if(!device.isEnabled()) return ;
        device.setChannel(device.getChannel() + 1);
        System.out.println("Mobile Remote - Channel UP: " + device.getChannel());
    }

    @Override
    public void print() {
        device.printStatus();
    }

}
