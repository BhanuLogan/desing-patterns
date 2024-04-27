package patterns.behavioral.command;

import commons.DesignPatternService;

public class CommandPatternService implements DesignPatternService {

    private void testCommandPatternService() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("COMMAND DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        File f1 = new File("1.txt");
        File f2 = new File("2.txt");

        CommandInvoker invoker = new CommandInvoker();

        Command f1TypeCommand = new TypeCommand(f1, "Hi Bhanu");
        Command f1CopyCommand = new CopyCommand(f1);
        Command f1PasteCommand = new PasteCommand(f1);

        Command f2TypeCommand = new TypeCommand(f2, "Hi Divya");

        invoker.enter(f2TypeCommand);

        invoker.enter(f1TypeCommand);
        invoker.enter(f1CopyCommand);
        invoker.enter(f1PasteCommand);

        System.out.println("1.txt contents: \n" + f1);

        System.out.println("\n2.txt contents:\n" + f2);

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testCommandPatternService();
    }
}
