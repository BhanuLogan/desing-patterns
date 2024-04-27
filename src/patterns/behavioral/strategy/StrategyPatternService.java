package patterns.behavioral.strategy;

import commons.DesignPatternService;
import patterns.behavioral.strategy.os.Andriod;
import patterns.behavioral.strategy.os.Ios;
import patterns.behavioral.strategy.processor.MediaTek;
import patterns.behavioral.strategy.processor.SnapDragon;

public class StrategyPatternService implements DesignPatternService {

    private void testStrategyPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("STRATEGY DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");
        
        Mobile poco = new Mobile("POCO M11", new Andriod(), new SnapDragon());
        Mobile iphone = new Mobile("Iphone 13 Pro", new Ios(), new SnapDragon());
        Mobile redme = new Mobile("Redme 14 Pro", new Andriod(), new MediaTek());

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testStrategyPattern();
    }
}
