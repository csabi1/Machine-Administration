package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();

/*
        Gepek gep = new Gepek();
        gep.setId(1);
        gep.setNev("NagyGep");
        gep.setSuly(3);
        gep.setSzerszamok_db(5);

        em.getTransaction().begin();
        em.persist(gep);
        em.getTransaction().commit();
        System.out.println(gep.getNev());*/
        getGepek();

    }

    private static List<Gepek> getGepek(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT r FROM Gepek r", Gepek.class).getResultList();
    }

}

