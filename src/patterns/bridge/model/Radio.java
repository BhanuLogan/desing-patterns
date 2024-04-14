package patterns.bridge.model;

public class Radio implements Device {

    private boolean on;
    private int volume, channel;

    public Radio() {
        this.on = false;
        this.volume = 0;
        this.channel = 1;
    }

    @Override
    public boolean isEnabled() {
       return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume < 0) {
            volume = 0;
        } else if(volume > 100) {
            volume = 100;
        }
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("This is Radio");
        System.out.println("Turned on: " + on);
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume);
        System.out.println();
    }

}
