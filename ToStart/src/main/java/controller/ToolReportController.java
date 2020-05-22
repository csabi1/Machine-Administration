package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.returnVal;
import model.Machines;
import model.Tools;

import java.util.ArrayList;
import java.util.List;


public class ToolReportController {

    private returnVal val;
   // private MyController temp;
    @FXML
    private Label macId;

    @FXML
    public void initialize(){
        val = new returnVal();

        List<Machines> allMachines = new ArrayList<>();

        allMachines = val.getStaticMachines();

        macId.setText(allMachines.get(1).getName());
      //  System.out.print(getTitle());


    }

}
