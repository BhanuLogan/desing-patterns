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
    public void takeSnapshot(String projectName) {
        Project project = projects.get(projectName);
        ProjectSnapshot snapshot = new ProjectSnapshot(project);
        history.add(snapshot);
    }

    @Override
    public void undo() {
        if(history.isEmpty()) return ;

        ProjectSnapshot snapshot = history.pop(); 
        Project project = projects.get(snapshot.getName());
        project.restore(snapshot);
    }

    @Override
    public void addProject(Project project) {
        projects.put(project.getName(), project);
    }


}
