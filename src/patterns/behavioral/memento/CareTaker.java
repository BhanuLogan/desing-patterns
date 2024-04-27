package patterns.behavioral.memento;

public interface CareTaker {
    void addProject(Project project);
    void takeSnapshot(String projectName);
    void undo();
}
