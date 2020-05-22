package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
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

    public List<String> listOfNames(){
        List<Gepek> akt = new ArrayList<>();

        akt = getGepek();

        ArrayList<String> names = new ArrayList<>();


        int size = akt.size();

        for ( int i =0; i < size ; i++)
        {
            names.add(akt.get(i).getNev());
        }
        return names;
    }

    public String myReturn()

    {

        /*
        String exp;
        List<Gepek> akt = new ArrayList<>();

        akt = getGepek();


        int size = akt.size();

        for ( int i =0; i < size ; i++)
        {
            System.out.print(akt.get(i).getNev());
        }
        Gepek aktGep = new Gepek();
        aktGep = getGepek().get(1);
        String p  = aktGep.getNev();*/
       // String s = getTools().stream().map(Tools::toString).collect(Collectors.joining(",\n "));

        return listOfNames().get(1);
    }
}
