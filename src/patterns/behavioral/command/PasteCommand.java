package patterns.behavioral.command;

public class PasteCommand  extends Command {

    public PasteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.paste(file.getCopiedText());
    }

}
