package patterns.behavioral.command;

public class CommandInvoker {

    public void enter(Command command) {
        command.execute();
    }

}
