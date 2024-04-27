package patterns.behavioral.memento;

// Originator
public class Project {

    private String name;
    private int version;

    public Project(String name) {
        this.name = name;
        this.version = 0;
    }

    public void upgradeVersion() {
        version++;
    }

    public int getVersion() {
        return version;
    }

    public void restore(ProjectSnapshot snapshot) {
        this.version = snapshot.getVersion();
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Project Name : " + name + "\nVersion: " + version + "\n";
    }
}
