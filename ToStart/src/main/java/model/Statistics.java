package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by the StatisticsController.
 * It's purpose to calculate statistics for all machines in the database.
 * */
public class Statistics {


    /**
     * Method to get all machines from database.
     * It's only required, so the other methods could get the machines.
     * */
    public static List<Machines> getMachines(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Machines l ORDER BY l",Machines.class).getResultList();
        } finally {
            em.close();
        }


    }

    /**
     * Method for listing only the weights from a list of machine.
     * @param mach here it gets the list of machines.
     * @return a list of only the weights.
     * */
    public List<Integer> listOfWeight(List<Machines> mach){


        ArrayList<Integer> weights = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            weights.add(mach.get(i).getWeight());
        }
        return weights;
    }

    /**
     * Method for listing only the weights from a list of machine.
     * @param mach here it gets the list of machines.
     * @return a list of only the tools_count (how many tools a CNC machine have).
     * */
    public List<Integer> listOfTools(List<Machines> mach){

        ArrayList<Integer> tools = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            tools.add(mach.get(i).getTools_count());
        }
        return tools;
    }

    /**
     * Method for listing only the weights from a list of machine.
     * @param mach here it gets the list of machines.
     * @return a list of only the floor space.
     * */
    public List<Integer> listOfFloor(List<Machines> mach){

        ArrayList<Integer> tools = new ArrayList<>();


        int size = mach.size();

        for ( int i =0; i < size ; i++)
        {
            tools.add(Integer.parseInt(mach.get(i).getFloor_space()));
        }
        return tools;
    }



    /**
     * Method for listing only the weights from a list of machine.
     * @param mach here it gets the list of machines.
     * @return a list of only the names.
     * */
    private List<String> getListOfNames(){
        returnVal val = new returnVal();
        List<String> temp  = new ArrayList<>();
        temp  = val.listOfNames();
        return temp;
    }


    /**
     * It calculates the sum of the given list.
     * It is used for the Weights list.
     * @param myList a list of integers.
     * @return a sum of the list.
     * */
    public int sumOfWeight(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }


    /**
     * Method to calculate the average of the weights given.
     * @param myList List of integers.
     * @return the average of the weights list.
     * */
    public int avgWeight(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }
    /**
     * It calculates the sum of the given list.
     * It is used for the Tools list.
     * @param myList a list of integers.
     * @return a sum of the list.
     * */
    public int sumOfTools(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }


    /**
     * Method to calculate the average of the tools given.
     * @param myList List of integers.
     * @return the average of the tools list.
     * */
    public int avgTools(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }

    /**
     * It calculates the sum of the given list.
     * It is used for the FloorSpace list.
     * @param myList a list of integers.
     * @return a sum of the list.
     * */
    public int sumOfFloorSpace(List<Integer> myList) {
        int res = 0;
        for (int i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        return res;
    }


    /**
     * Method to calculate the average of the tools given.
     * @param myList List of integers.
     * @return the average of the tools list.
     * */
    public int avgFloorSpace(List<Integer> myList){
        int res=0;
        int i;
        for (i = 0; i < myList.size(); i++){
            res += myList.get(i);
        }
        res = res / i;
        return res;
    }


    /**
     * Method that calculates a recommended space for the CNC machines.
     * @param myList A list containing the minimum  space requirement of the machines.
     * @return The recommended space for the machines.
     * */
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
