package org.academiadecadigo.bootcamp.persistence;

public interface TransactionManager {

    void beginTransaction();

    void commit();

    void rollback();

}
