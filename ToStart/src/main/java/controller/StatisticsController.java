package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Machines;
import model.Statistics;
import model.returnVal;
import org.tinylog.Logger;

import java.util.ArrayList;
import java.util.List;

public class StatisticsController {


    @FXML
    private Label totalWeight;

    @FXML
    private Label totalMachines;

    @FXML
    private Label avgWeight;

    @FXML
    private Label totalTools;

    @FXML
    private Label avgTools;

    @FXML
    private Label avgFloorSpace;

    @FXML
    private Label minReq;

    @FXML
    private Label recSpc;
    


    @FXML
    public void initialize(){

        Logger.trace("Statistics started");
        Statistics val = new Statistics();
        List<Integer> akt = new ArrayList<>();
        List<Machines> allMachines = new ArrayList<>();
        allMachines = val.getMachines();
        akt = val.listOfWeight(allMachines);

        totalWeight.setText(val.sumOfWeigth(akt) + " kg");
    }

}
