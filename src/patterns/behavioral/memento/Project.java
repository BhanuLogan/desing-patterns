package patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

// Originator
public class Project {

    private String name;
    private int version;
    private Map<Integer, String> commits;

    public Project(String name) {
        this.commits = new HashMap<>();
        this.name = name;
        this.version = 0;
    }

    public void commit(String message) {
        commits.put(++version, message);
    }


    public int getVersion() {
        return version;
    }

    public Map<Integer, String> getCommits() {
        return commits;
    }

    public void rollback(ProjectSnapshot snapshot) {
        this.commits = new HashMap<>(snapshot.getCommits());
        this.version = snapshot.getVersion();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("Project Name : " + name + "\nCur Version: " + version + "\n" + "commits:\n");
        for(int ver : commits.keySet()) {
            str.append(ver).append(" ").append(commits.get(ver)).append("\n");
        }
        str.append("\n");
        return str.toString();
    }
}
