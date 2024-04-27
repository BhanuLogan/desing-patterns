package patterns.behavioral.command;

public class TypeCommand extends Command {
    private String str;
    public TypeCommand(File editor, String str) {
        this.file = editor;
        this.str = str;
    }

    @Override
    public void execute() {
        file.type(str);
    }

}
