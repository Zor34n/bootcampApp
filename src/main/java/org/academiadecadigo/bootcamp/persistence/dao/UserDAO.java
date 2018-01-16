package org.academiadecadigo.bootcamp.persistence.dao;

import org.academiadecadigo.bootcamp.model.User;

import java.util.List;

public interface UserDAO {



    User findById(Integer id);

    List<User> findAll();

    long count();

    void saveOrUpdate(User user);

    void remove(User user);

    User findByName(String username);

}
