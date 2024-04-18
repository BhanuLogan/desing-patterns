package patterns.behavioral.chainOfResponsibility;

public interface LeaveApprover {
    void next(LeaveApprover handler);
    void process(LeaveRequest request);
}
