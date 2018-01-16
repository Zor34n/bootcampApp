package org.academiadecadigo.bootcamp.service;

import org.academiadecadigo.bootcamp.model.User;
import org.academiadecadigo.bootcamp.persistence.TransactionManager;
import org.academiadecadigo.bootcamp.persistence.dao.UserDAO;

public class UserServiceImplementation implements UserService {

    private UserDAO userDAO;
    private TransactionManager tm;


    public UserServiceImplementation(UserDAO userDAO, TransactionManager tm) {
        this.userDAO = userDAO;
        this.tm = tm;
    }

    public boolean authenticate(String username, String password) {

        User user = findByUsername(username);

        if (user == null) {
            return false;
        }

        String pass = user.getPassword();
        return pass.equals(password);
    }


    public User findByUsername(String username) {
        User user = null;

        try {
            tm.beginTransaction();
            user = userDAO.findByName(username);
            tm.commit();
        } catch (Exception e) {
            tm.rollback();
        }
        return user;
    }

    public void addUser(User user) {


        try {
            tm.beginTransaction();
            userDAO.saveOrUpdate(user);
            tm.commit();
        } catch (Exception e) {
            tm.rollback();
        }

    }

    public long count() {

        long result = 0;

        try {
            tm.beginTransaction();
            result = userDAO.count();
            tm.commit();
        } catch (Exception e) {
            tm.rollback();
        }
        return result;
    }
}
