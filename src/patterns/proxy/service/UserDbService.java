package patterns.proxy.service;

import patterns.proxy.model.User;

public class UserDbService implements UserService {

    @Override
    public void save(User user) {
        System.out.println("successfully saved in DB: " + user);
    }

    @Override
    public User get(int id) {
        System.out.println("Fetching user " + id +  " from DB");
        return new User(id, "Dummy");
    }

}
