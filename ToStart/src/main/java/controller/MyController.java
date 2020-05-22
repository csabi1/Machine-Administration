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
import model.returnVal;

import java.io.IOException;
import java.util.ArrayList;


public class MyController {

    @FXML
    private TextField myText;

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox listOfMach;

    private returnVal val;

    @FXML
    public void initialize(){
        val = new returnVal();
    }

    public void iras(ActionEvent actionEvent) {

        for (int i =0 ; i < val.listOfNames().size()  ;i++) {
            listOfMach.getItems().add(val.listOfNames().get(i));
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
}
