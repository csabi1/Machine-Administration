package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.stream.Collectors;

public class returnVal {


    private static List<Gepek> getGepek(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        return em.createQuery("SELECT r FROM Gepek r", Gepek.class).getResultList();
    }
    public String myReturn()

    {

        String s = getGepek().stream().map(Gepek::toString).collect(Collectors.joining(", "));
        return s;
    }
}
