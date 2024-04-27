package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirportTrafficControlTower implements AirTrafficControlTower {

    private List<Airplane> airplaneList;

    public AirportTrafficControlTower() {
        this.airplaneList = new ArrayList<>();
    }

    @Override
    public void requestTakeOff(Airplane airplane) {
        // logic for notifying take off for airplane
        for(Airplane plane : airplaneList) {
            // check if there is a chance for plane collison
        }
        // inform plane to take off if no issues.
        airplane.takeOff();
    }

    @Override
    public void requestLanding(Airplane airplane) {
        // logic for notifying take off for airplane
        for(Airplane plane : airplaneList) {
            // check if there is a chance for plane collison
        }
        // inform plane to land if no issues.
        airplane.land();
    }

    @Override
    public void register(Airplane airplane) {
        airplaneList.add(airplane);
    }

    @Override
    public void unregister(Airplane airplane) {
        airplaneList.remove(airplane);
    }

}
