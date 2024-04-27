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

        ironbank.upgradeVersion();
        ironbank.upgradeVersion();

        System.out.println(ironbank);

        github.takeSnapshot(ib);

        ironbank.upgradeVersion();
        ironbank.upgradeVersion();
        System.out.println(ironbank);

        bumblebee.upgradeVersion();

        github.undo();

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
