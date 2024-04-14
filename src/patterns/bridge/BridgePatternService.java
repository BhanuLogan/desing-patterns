package patterns.bridge;


import commons.DesignPatternService;
import patterns.bridge.model.Device;
import patterns.bridge.model.MobileRemote;
import patterns.bridge.model.NormalRemote;
import patterns.bridge.model.Radio;
import patterns.bridge.model.Remote;
import patterns.bridge.model.Tv;

public class BridgePatternService implements DesignPatternService {

    private void testBridgePattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("BRIDGE DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n\n");

        Device tv = new Tv();
        Device radio = new Radio();
        Device smartTv = new Tv();

        Remote tvRemote = new NormalRemote(tv);
        Remote mobileRemote = new MobileRemote(radio);
        Remote smartTvRemote = new MobileRemote(smartTv);

        tvRemote.print();
        tvRemote.power();
        tvRemote.channelUp();
        tvRemote.volumeUp();
        tvRemote.print();

        mobileRemote.print();
        mobileRemote.volumeUp();
        mobileRemote.volumeUp();
        mobileRemote.power();
        mobileRemote.volumeUp();
        mobileRemote.print();

        smartTvRemote.print();
        smartTvRemote.power();
        smartTvRemote.channelUp();
        smartTvRemote.channelUp();
        smartTvRemote.power();
        smartTvRemote.channelUp();
        smartTvRemote.print();

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testBridgePattern();
    }
}
