package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Machines;
import model.Statistics;
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
        List<Integer> allWeight = new ArrayList<>();
        List<Integer> allTools = new ArrayList<>();
        List<Integer> allSpace = new ArrayList<>();

        List<Machines> allMachines = new ArrayList<>();

        allMachines = val.getMachines();
        allWeight = val.listOfWeight(allMachines);
        allTools = val.listOfTools(allMachines);
        allSpace = val.listOfFloor(allMachines);

        totalMachines.setText(Integer.toString(allMachines.size()));
        totalWeight.setText(val.sumOfWeight(allWeight) + " kg");
        avgWeight.setText(val.avgWeight(allWeight) + " kg");
        totalTools.setText(val.sumOfTools(allTools) + " pc");
        avgTools.setText(val.avgTools(allTools) + " pc");
        avgFloorSpace.setText(val.avgFloorSpace(allSpace) + " cm2");
        minReq.setText(val.sumOfFloorSpace(allSpace)+ " cm2");
        recSpc.setText(val.recFloorSpace(allSpace)+ " cm2");

    }

}
