package patterns.behavioral.command;

public class CopyCommand extends Command {
    
    public CopyCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.copy();
    }

}
