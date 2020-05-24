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


        ArrayList<Integer> weights = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            weights.add(mach.get(i).getWeight());
        }
        return weights;
    }


    public List<Integer> listOfTools(List<Machines> mach){

        ArrayList<Integer> tools = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            tools.add(mach.get(i).getTools_count());
        }
        return tools;
    }

    public List<Integer> listOfFloor(List<Machines> mach){

        ArrayList<Integer> tools = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            tools.add(Integer.parseInt(mach.get(i).getFloor_space()));
        }
        return tools;
    }




    private List<String> getListOfNames(){
        returnVal val = new returnVal();
        List<String> temp  = new ArrayList<>();
        temp  = val.listOfNames();
        return temp;
    }



    public int sumOfWeight(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }

    public int avgWeight(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }

    public int sumOfTools(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }

    public int avgTools(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }

    public int sumOfFloorSpace(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }

    public int avgFloorSpace(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }

    public int recFloorSpace(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
            res += 120;
        }

        return res;
    }


}
