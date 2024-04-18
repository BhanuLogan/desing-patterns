package patterns.behavioral.chainOfResponsibility;

public class Manager implements LeaveApprover {

    private double approvalDays = 3;

    private LeaveApprover nextHandler;

    @Override
    public void next(LeaveApprover handler) {
        this.nextHandler = handler;
    }

    @Override
    public void process(LeaveRequest request) {
        System.out.println("Requesting leave for " + request.days + " days");
        if(request.days <= approvalDays) {
            System.out.println("Approved by Manager!!!");
        } else if(nextHandler != null) {
            System.out.println("Manager - Forwarding request to superior");
            nextHandler.process(request);
        } else {
            System.out.println("Request can't be processed");
        }
    }

}
