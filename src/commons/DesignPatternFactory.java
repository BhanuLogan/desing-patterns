package commons;

import patterns.adapter.AdapterPatternService;
import patterns.behavioral.chainOfResponsibility.ChainOfResponsibilityPatternService;
import patterns.behavioral.command.CommandPatternService;
import patterns.behavioral.mediator.MediatorPatternService;
import patterns.behavioral.memento.MementoPatternService;
import patterns.behavioral.observer.ObserverPatternService;
import patterns.behavioral.strategy.StrategyPatternService;
import patterns.behavioral.template.TemplatePatternService;
import patterns.bridge.BridgePatternService;
import patterns.composite.CompositePatternService;
import patterns.decorator.DecoratorPatternService;
import patterns.facade.FacadePatternService;
import patterns.factory.FactoryPatternService;
import patterns.proxy.ProxyPatternService;
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
            case FACADE:
                return new FacadePatternService();
            case BRIDGE:
                return new BridgePatternService();
            case DECORATOR:
                return new DecoratorPatternService();
            case CHAIN_OF_RESPONSIBILITY:
                return new ChainOfResponsibilityPatternService();
            case TEMPLATE:
                return new TemplatePatternService();
            case OBSERVER:
                return new ObserverPatternService();
            case MEDIATOR:
                return new MediatorPatternService();
            case COMMAND:
                return new CommandPatternService();
            case MEMENTO:
                return new MementoPatternService();
            default:
                return null;
        }
    }
}