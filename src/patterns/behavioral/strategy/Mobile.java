package patterns.behavioral.strategy;

import patterns.behavioral.strategy.os.Os;
import patterns.behavioral.strategy.processor.Processor;

public class Mobile {
    private String model;
    private Os os;
    private Processor processor;

    public Mobile(String model, Os os, Processor processor) {
        this.model = model;
        this.os = os;
        this.processor = processor;
        configure();
    }

    private void configure() {
        System.out.println("Installing os & processor for model - " + model);
        os.installOs();
        processor.installProcessor();
        System.out.println("Installation is successful\n\n");
    }
}
