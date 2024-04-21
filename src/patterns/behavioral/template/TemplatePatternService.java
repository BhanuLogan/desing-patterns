package patterns.behavioral.template;

import commons.DesignPatternService;

public class TemplatePatternService implements DesignPatternService {

    private void testTemplatePatternService() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("TEMPLATE DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        DataMiningService file = new FileMiningService();
        DataMiningService s3 = new S3MiningService();
        DataMiningService db = new DbMiningService();

        db.mine();
        System.out.println();
        file.mine();
        System.out.println();
        s3.mine();

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testTemplatePatternService();
    }
}
