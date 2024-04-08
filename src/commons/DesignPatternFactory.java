package commons;

import util.Constants.DesignPattern;

public class DesignPatternFactory {
    public static DesignPatternService getInstance(DesignPattern pattern) {
        switch (pattern) {
            case ADAPTER:
                return new AdapterPatternService();
            case COMPOSITE:
                return new CompositePatternService();
            case FACTORY:
                return new FactoryPatternService();
            case STRATEGY:
                return new StrategyPatternService();
            default:
                return null;
        }
    }
}