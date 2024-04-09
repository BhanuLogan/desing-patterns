package commons;

import patterns.adapter.AdapterPatternService;
import patterns.composite.CompositePatternService;
import patterns.factory.FactoryPatternService;
import patterns.proxy.ProxyPatternService;
import patterns.strategy.StrategyPatternService;
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
            case PROXY:
                return new ProxyPatternService();
            default:
                return null;
        }
    }
}