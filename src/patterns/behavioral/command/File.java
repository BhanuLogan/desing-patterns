package patterns.behavioral.command;

public class File {

    private final String NEW_LINE = "\n";
    private String name;
    private StringBuilder text;
    private String copiedText;

    public File(String name) {
        this.name = name;
        this.copiedText = "";
        this.text = new StringBuilder();
    }

    public void type(String text) {
        this.text.append(text);
    }

    public void copy() {
        copiedText = text.toString();
    }

    public String getCopiedText() {
        return copiedText;
    }

    public void paste(String text) {
        this.text.append(NEW_LINE).append(text);
    }

    public String toString() {
        return text.toString();
    }

}
