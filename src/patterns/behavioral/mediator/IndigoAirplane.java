package patterns.behavioral.mediator;

public class IndigoAirplane extends Airplane {

    private AirTrafficControlTower mediator;

    IndigoAirplane(AirTrafficControlTower mediator, String planeNumber) {
        this.mediator = mediator;
        this.planeNumber = planeNumber;
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void takeOff() {
        System.out.println("Take Off - " + planeNumber);
    }

    @Override
    public void land() {
        System.out.println("Landing - " + planeNumber);
    }

}
