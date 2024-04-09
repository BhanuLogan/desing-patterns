package patterns.proxy.service;

import java.util.HashMap;
import java.util.Map;

import patterns.proxy.model.User;

public class UserProxyService implements UserService {

    private UserService userService;
    private Map<Integer, User> inMemoryCache;

    public UserProxyService(UserService userService) {
        this.userService = userService;
        this.inMemoryCache = new HashMap<>();
    }

    @Override
    public void save(User user) {
        userService.save(user);
    }

    private void saveToCache(User user) {
        inMemoryCache.put(user.id, user);
        System.out.println("successfully saved user in cache " + user);
    }

    @Override
    public User get(int id) {
        if(inMemoryCache.containsKey(id)) {
            System.out.printf("Fetching user %d from cache\n", id);
            return inMemoryCache.get(id);
        } else {
            User user = userService.get(id);
            saveToCache(user);
            return user;
        }
    }
}
