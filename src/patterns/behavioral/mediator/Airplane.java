package patterns.behavioral.mediator;

public abstract class Airplane {

    protected String planeNumber;

    public abstract void requestTakeOff();
    public abstract void requestLanding();
    public abstract void takeOff();
    public abstract void land();
}