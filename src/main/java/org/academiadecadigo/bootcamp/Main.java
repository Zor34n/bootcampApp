package org.academiadecadigo.bootcamp;

import org.academiadecadigo.bootcamp.controller.LoginController;
import org.academiadecadigo.bootcamp.model.User;
import org.academiadecadigo.bootcamp.persistence.JPATransactionManager;
import org.academiadecadigo.bootcamp.persistence.SessionManager;
import org.academiadecadigo.bootcamp.persistence.TransactionManager;
import org.academiadecadigo.bootcamp.persistence.dao.JpaUserDAO;
import org.academiadecadigo.bootcamp.persistence.dao.UserDAO;
import org.academiadecadigo.bootcamp.service.UserService;
import org.academiadecadigo.bootcamp.service.UserServiceImplementation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
        SessionManager sm = new SessionManager();
        sm.setEmf(emf);

        TransactionManager tm = new JPATransactionManager(sm);
        UserDAO userDAO = new JpaUserDAO(sm);

        UserService us = new UserServiceImplementation(userDAO, tm);

        LoginController loginController = new LoginController();
        loginController.setUserService(us);

        us.addUser(new User("user2", "pass2", "email3@tudo.pt"));








    }


}
