import commons.DesignPatternFactory;
import commons.DesignPatternService;
import util.Constants.DesignPattern;

public class App {
    public static void main(String[] args) {
        DesignPatternService service = DesignPatternFactory.getInstance(DesignPattern.CHAIN_OF_RESPONSIBILITY);
        service.runExample();
    }
}