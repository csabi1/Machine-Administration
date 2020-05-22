package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.stream.Collectors;


public class returnVal {


    private static List<Gepek> getGepek(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Gepek l ORDER BY l",Gepek.class).getResultList();
        } finally {
            em.close();
        }


    }

    private static List<String> getNames(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select 2 from Gepek l", String.class).getResultList();
        } finally {
            em.close();
        }
    }
    public String myReturn()

    {
        Gepek aktGep = new Gepek();
        aktGep = getGepek().get(1);
        String p  = aktGep.getNev();
   //     String s = getGepek().stream().map(Gepek::toString).collect(Collectors.joining(",\n "));
        return p;
    }
}
