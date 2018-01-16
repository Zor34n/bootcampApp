package org.academiadecadigo.bootcamp.persistence.dao;

import org.academiadecadigo.bootcamp.model.User;
import org.academiadecadigo.bootcamp.persistence.SessionManager;
import org.academiadecadigo.bootcamp.persistence.TransactionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JpaUserDAO implements UserDAO {


    private SessionManager sm;

    public JpaUserDAO(SessionManager sm) {
        this.sm = sm;
    }


    public User findById(Integer id) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public long count() {
        return 0;
    }

    public void saveOrUpdate(User user) {
        EntityManager em2 = sm.getCurrentSession();
        em2.merge(user);
    }

    public void remove(User user) {

    }

    public User findByName(String username) {
        return null;
    }

    public void setSm(SessionManager sm) {
        this.sm = sm;
    }
}
