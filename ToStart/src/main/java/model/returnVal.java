package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The class that makes the the main work of the project.
 * It connects to database and makes database requests.
 * It also convert, and maps the given types.
 * It calculates statistics.
 * */

public class returnVal {


    /**
     * Function to get, the list of machines from database.
     * */
    private static List<Machines> getMachines(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Machines l ORDER BY l",Machines.class).getResultList();
        } finally {
            em.close();
        }


    }

    /**
     * Function to get, the list of tools from database.
     * */
    private static List<Tools> getTools(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Tools l ORDER BY l",Tools.class).getResultList();
        } finally {
            em.close();
        }


    }

    /**
     * Function to get only the names of the machines, that was given to it by, the
     * getTools function.
     * */
    public List<String> listOfNames(){
        List<Machines> akt = new ArrayList<>();

        akt = getMachines();

        ArrayList<String> names = new ArrayList<>();


        int size = akt.size();

        for ( int i =0; i < size ; i++)
        {
            names.add(akt.get(i).getName());
        }
        return names;
    }



    /**
     * Function that makes an ArrayList of the machine list.
     * */
    public static List<Machines> getStaticMachines(){
        List<Machines> allMachines = new ArrayList<>();

        allMachines = getMachines();

        return allMachines;

    }

    /**
     * Function that makes an ArrayList of the tools list.
     * */
    public static List<Tools> getStaticTools(){
        List<Tools> allTools = new ArrayList<>();

        allTools = getTools();

        return allTools;

    }

    /**
     * Function to map out tools for printing.
     * */
    public String mappedTools()

    {
        String s = getTools().stream().map(Tools::toString).collect(Collectors.joining(",\n"));

        return s;
    }


    /**
     *  Function to build a nice string, of the requested fields of the tools.
     *  Purpose is to print the string to a label.
     * */
    public String printBuilder(int actMachine){

        List<Tools> allTools = new ArrayList<>();

        allTools = getStaticTools();


        Logger.trace("Printing out one element {}",allTools.get(1).getName());
        String result="";
        for (int i = 0 ; i < allTools.size() ; i++){

           // System.out.println(allTools.get(i).getMachineId());
           //   System.out.println(actMachine);

            if (allTools.get(i).getMachineId() == actMachine) {
                Logger.debug("The program entered the loop");
               result += "Name: " + allTools.get(i).getName() + " Abrasion: " + allTools.get(i).getAbrasion() +"% Material: " + allTools.get(i).getMaterial() +"\n";

            }

        }
        return result;


    }

    /**
     * A function to calculate the average abrasion, of tools
     * that belongs to a given machine.
     * */
    public int avrageAbrasion(int actMachine){

        List<Tools> allTools = new ArrayList<>();

        allTools = getStaticTools();


        int result=0;
        int count  ;
        for ( count = 0 ; count < allTools.size() ; count++){


            if (allTools.get(count).getMachineId() == actMachine) {
                result += allTools.get(count).getAbrasion();


            }

        }
        return result / count;
    }
}
