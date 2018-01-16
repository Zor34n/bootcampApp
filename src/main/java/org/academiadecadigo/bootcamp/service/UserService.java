package org.academiadecadigo.bootcamp.service;

import org.academiadecadigo.bootcamp.model.User;

public interface UserService {

    boolean  authenticate(String username, String password);

    User findByUsername(String username);

    void addUser(User user);

    long count();


}
