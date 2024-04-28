package patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Github implements CareTaker {
    private Map<String, Project> projects;
    private Stack<ProjectSnapshot> history;

    public Github() {
        this.history = new Stack<>();
        this.projects = new HashMap<>();
    }

    @Override
    public void commit(String projectName, String message) {
        Project project = projects.get(projectName);
        ProjectSnapshot snapshot = new ProjectSnapshot(project);
        history.push(snapshot);
        project.commit(message);
    }

    @Override
    public void rollback() {
        if(history.isEmpty()) return ;

        ProjectSnapshot snapshot = history.pop(); 
        Project project = projects.get(snapshot.getName());
        project.rollback(snapshot);
    }

    @Override
    public void addProject(Project project) {
        projects.put(project.getName(), project);
    }


}
