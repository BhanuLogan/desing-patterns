package patterns.behavioral.command;

public abstract class Command {
    protected File file;
    public abstract void execute();
}
