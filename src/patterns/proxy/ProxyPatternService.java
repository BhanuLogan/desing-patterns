package patterns.proxy;

import commons.DesignPatternService;
import patterns.proxy.model.User;
import patterns.proxy.service.UserDbService;
import patterns.proxy.service.UserProxyService;
import patterns.proxy.service.UserService;

public class ProxyPatternService implements DesignPatternService {

    private UserService userProxyService;
    private UserService userDbService;

    public ProxyPatternService() {
        this.userDbService = new UserDbService();
        this.userProxyService = new UserProxyService(userDbService);
    }

    private void testProxyPattern() {
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("FACTORY DESIGN PATTERN");
        System.out.println("-------------------------------------------------\n");

        User u1 = new User(1, "Bhanu");
        User u2 = new User(2, "Ganta");
        User u3 = new User(3, "Divya");

        userProxyService.save(u1);
        userProxyService.save(u2);
        userProxyService.save(u3);

        System.out.println("\n");
        userProxyService.get(1);
        userProxyService.get(2);
        userProxyService.get(1);
        userProxyService.get(3);
        userProxyService.get(3);

        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------\n\n");
    }

    @Override
    public void runExample() {
        testProxyPattern();
    }
}
