package patterns.behavioral.chainOfResponsibility;

import commons.DesignPatternService;

public class ChainOfResponsibilityPatternService implements DesignPatternService {

    private void testChainOfResponsibilityPattern() {
        LeaveApprover manager = new Manager();
        LeaveApprover director = new Director();
        LeaveApprover vicePresident = new VicePresident();

        manager.next(director);
        director.next(vicePresident);

        LeaveRequest r1 = new LeaveRequest(2);
        LeaveRequest r2 = new LeaveRequest(5);
        LeaveRequest r3 = new LeaveRequest(15);

        System.out.println("\n\n-------------------------------------------------");
        System.out.println("CHAIN OF RESPONSIBILITY DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        manager.process(r1);
        System.out.println();
        manager.process(r2);
        System.out.println();
        manager.process(r3);
        System.out.println();

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testChainOfResponsibilityPattern();
    }
}
