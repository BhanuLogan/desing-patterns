package patterns.proxy.service;

import patterns.proxy.model.User;

public interface UserService {
    void save(User user);
    User get(int id);
}
