package org.academiadecadigo.bootcamp.persistence;

public class JPATransactionManager implements TransactionManager{

    SessionManager sm;

    public JPATransactionManager(SessionManager sm){
        this.sm = sm;
    }


    public void beginTransaction() {
        sm.getCurrentSession().getTransaction().begin();
    }


    public void commit() {
    sm.getCurrentSession().getTransaction().commit();
    sm.stopSession();
    }

    public void rollback() {
        sm.getCurrentSession().getTransaction().rollback();
        sm.stopSession();
    }


}
