package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class returnVal {


    private static List<Machines> getMachines(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();
        try{
            return em.createQuery("select l from Machines l ORDER BY l",Machines.class).getResultList();
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

    public static List<Machines> getStaticMachines(){
        List<Machines> allMachines = new ArrayList<>();

        allMachines = getMachines();

        return allMachines;

    }

    public static List<Tools> getStaticTools(){
        List<Tools> allTools = new ArrayList<>();

        allTools = getTools();

        return allTools;

    }
    public String mappedTools()

    {
        String s = getTools().stream().map(Tools::toString).collect(Collectors.joining(",\n"));

        return s;
    }

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

    public int avrageAbrassion(int actMachine){

        List<Tools> allTools = new ArrayList<>();

        allTools = getStaticTools();


        int result=0;
        int count  = 0;
        for ( count = 0 ; count < allTools.size() ; count++){


            if (allTools.get(count).getMachineId() == actMachine) {
                result += allTools.get(count).getAbrasion();


            }

        }
        return result / (count-1);
    }
}
