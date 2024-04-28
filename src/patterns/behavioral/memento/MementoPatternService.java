package patterns.behavioral.memento;

import commons.DesignPatternService;

public class MementoPatternService implements DesignPatternService {

    private void testMementoPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("MEMENTO DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        Github github = new Github();

        String ib = "ironbank";
        String bb = "bumblebee";
        
        Project ironbank = new Project(ib);
        Project bumblebee = new Project(bb);

        github.addProject(ironbank);
        github.addProject(bumblebee);

        github.commit(ib, "initial commit");
        github.commit(bb, "initial commit");

        System.out.println(ironbank);
        System.out.println(bumblebee);
        github.commit(ib, "file structure was added");
        github.commit(ib, "utilities were added");
        
        System.out.println(ironbank);

        github.rollback();

        System.out.println("AFTER UNDO - ");
        System.out.println(ironbank);
        System.out.println(bumblebee);
        
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testMementoPattern();
    }
}
