package patterns.facade;

import commons.DesignPatternService;

public class FacadePatternService implements DesignPatternService {

    private void testFacadePattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("FACADE DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n\n");

        ApkFacade facade = new ApkFacade();

        facade.install("youtube");
        facade.install("pubg");

        facade.uninstall("youtube");

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testFacadePattern();
    }
}
