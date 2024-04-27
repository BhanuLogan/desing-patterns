package patterns.behavioral.mediator;

public interface AirTrafficControlTower {
    void register(Airplane airplane);
    void unregister(Airplane airplane);
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}