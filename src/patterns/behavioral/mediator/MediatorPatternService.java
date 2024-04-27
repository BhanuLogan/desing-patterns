package patterns.behavioral.mediator;

import commons.DesignPatternService;

public class MediatorPatternService implements DesignPatternService {

    private void testMediatorPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("MEDIATOR DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        AirTrafficControlTower mediator = new AirportTrafficControlTower();
        Airplane plane1 = new IndigoAirplane(mediator, "IND_001");
        Airplane plane2 = new IndigoAirplane(mediator, "IND_002");

        plane1.requestLanding();
        plane2.requestLanding();

        plane1.requestTakeOff();

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testMediatorPattern();
    }
}
