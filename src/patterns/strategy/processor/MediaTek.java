package patterns.strategy.processor;

public class MediaTek implements Processor {

    @Override
    public void installProcessor() {
        System.out.println("Installed MediaTek processor");
    }

}
