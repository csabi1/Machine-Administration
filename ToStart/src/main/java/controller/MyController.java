package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MyApp;
import model.Machines;
import model.returnVal;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class MyController {

    @FXML
    private TextField myText;

    @FXML
    private Label myLabel;


    @FXML
    private Label macName;
    @FXML
    private Label macId;
    @FXML
    private Label macMotor;
    @FXML
    private Label macTools;
    @FXML
    private Label macWeight;
    @FXML
    private Label macSpace;
    @FXML
    private ChoiceBox listOfMach;

    private returnVal val;

    @FXML
    public void initialize(){
         val = new returnVal();
    }

    public String selectedMachine(){
        return (String) listOfMach.getValue();
    }

    public void iras(ActionEvent actionEvent) {


        List<String> my = new ArrayList<>();
        my = val.listOfNames();
        listOfMach.getItems().clear();
        for (int i =0 ; i < my.size()  ;i++) {
            listOfMach.getItems().add(my.get(i));
        }
    }

    public void switchToAdd(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(MyApp.class.getResource("/fxml/newvalue.fxml"));
        Stage stage = new Stage();
        stage.setTitle("New Item");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void newToolReport(ActionEvent actionEvent) throws  IOException{

        List<Machines> allMachines = new ArrayList<>();

        allMachines = val.getStaticMachines();
        System.out.print(selectedMachine());
        for (int i=0; i < allMachines.size() ; i++)
        {
            if (allMachines.get(i).getName().equals(selectedMachine())) {
                macName.setText(allMachines.get(i).getName());

                macId.setText(Integer.toString(allMachines.get(i).getId()));

                macMotor.setText(allMachines.get(i).getMotor());

                macTools.setText(Integer.toString(allMachines.get(i).getTools_count())+" db");

                macSpace.setText(allMachines.get(i).getFloor_space() + " mm");

                macWeight.setText(Integer.toString(allMachines.get(i).getTools_count())+" kg");
            }

        }




    }
}
