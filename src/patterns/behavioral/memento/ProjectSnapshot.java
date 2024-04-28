package patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class ProjectSnapshot {
    private String name;
    private int version;
    private Map<Integer, String> commits;

    public ProjectSnapshot(Project project) {
        this.name = project.getName();
        this.version = project.getVersion();
        this.commits = new HashMap<>(project.getCommits());
    }

    public int getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, String> getCommits() {
        return commits;
    }
}
