package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Statistics {


    public static List<Machines> getMachines(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Machines l ORDER BY l",Machines.class).getResultList();
        } finally {
            em.close();
        }


    }

    public List<Integer> listOfWeight(List<Machines> mach){
        List<Machines> akt = new ArrayList<>();

        akt = mach;

        ArrayList<Integer> weights = new ArrayList<>();


        int size = akt.size();

        for ( int i =0; i < size ; i++)
        {
            weights.add(akt.get(i).getWeight());
        }
        return weights;
    }


    private List<String> getListOfNames(){
        returnVal val = new returnVal();
        List<String> temp  = new ArrayList<>();
        temp  = val.listOfNames();
        return temp;
    }



    public int sumOfWeigth(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }

}
