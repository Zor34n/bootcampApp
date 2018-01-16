package org.academiadecadigo.bootcamp.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionManager {



    private EntityManagerFactory emf;
    private EntityManager em;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }



    public void startSession(){

        if(em==null){
            em = emf.createEntityManager();
        }

    }

    public void stopSession(){

        if(em!=null){
            em.close();
        }

        em = null;
    }

    public EntityManager getCurrentSession(){
        if(em==null){
            startSession();
        }
        return em;
    }

}
