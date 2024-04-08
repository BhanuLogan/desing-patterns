package patterns.strategy.processor;

public class SnapDragon implements Processor {

    @Override
    public void installProcessor() {
        System.out.println("Installed Snap Dragon processor");
    }

}
