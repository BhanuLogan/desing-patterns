package patterns.behavioral.memento;

public interface CareTaker {
    void addProject(Project project);
    void commit(String projectName, String message);
    void rollback();
}
