package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.returnVal;

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

       ArrayList<String> names = new ArrayList<>();

      //  names = val.listOfNames();
      //  int size = names.size();

        for (int i =0 ; i < val.listOfNames().size()  ;i++) {
            listOfMach.getItems().add(val.listOfNames().get(i));
        }


      //  myLabel.setText(val.myReturn());
    }
}
