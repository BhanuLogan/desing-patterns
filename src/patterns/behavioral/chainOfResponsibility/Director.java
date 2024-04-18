package patterns.behavioral.chainOfResponsibility;

public class Director implements LeaveApprover {
    private double approvalDays = 10;

    private LeaveApprover nextHandler;

    @Override
    public void next(LeaveApprover handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(LeaveRequest request) {
        if(request.days <= approvalDays) {
            System.out.println("Approved by Director!!!");
        } else if(nextHandler != null) {
            System.out.println("Director - Forwarding request to superior");
            nextHandler.process(request);
        } else {
            System.out.println("Request can't be processed");
        }
    }
}
