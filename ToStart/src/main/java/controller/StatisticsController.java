package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Statistics;
import model.returnVal;
import org.tinylog.Logger;

import java.util.ArrayList;
import java.util.List;

public class StatisticsController {


    @FXML
    private Label infLabel;

    @FXML
    public void initialize(){

        Logger.trace("Statistics started");
        Statistics val = new Statistics();
        List<Integer> akt = new ArrayList<>();
        akt = val.listOfWeight();

        infLabel.setText(val.sumOfWeigth(akt) + " kg");
    }

}
