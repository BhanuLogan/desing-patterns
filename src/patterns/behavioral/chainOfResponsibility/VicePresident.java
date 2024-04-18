package patterns.behavioral.chainOfResponsibility;

public class VicePresident implements LeaveApprover {

    private LeaveApprover nextHandler;

    @Override
    public void next(LeaveApprover handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(LeaveRequest request) {
        System.out.println("Approved by VC!!!");
    }
}
