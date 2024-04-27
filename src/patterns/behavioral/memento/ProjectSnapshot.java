package patterns.behavioral.memento;

public class ProjectSnapshot {
    private String name;
    private int version;

    public ProjectSnapshot(Project project) {
        this.name = project.getName();
        this.version = project.getVersion();
    }

    public int getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}
