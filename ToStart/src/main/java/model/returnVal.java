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

    private static List<Tools> getTools(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Tools l ORDER BY l",Tools.class).getResultList();
        } finally {
            em.close();
        }


    }

    public String myReturn()

    {
       /* Gepek aktGep = new Gepek();
        aktGep = getGepek().get(1);
        String p  = aktGep.getNev();*/
        String s = getTools().stream().map(Tools::toString).collect(Collectors.joining(",\n "));
        return s;
    }
}
