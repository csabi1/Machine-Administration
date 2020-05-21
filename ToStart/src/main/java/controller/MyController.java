package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.returnVal;


public class MyController {

    @FXML
    private TextField myText;

    @FXML
    private Label myLabel;

    private returnVal val;

    @FXML
    public void initialize(){
        val = new returnVal();
    }

    public void iras(ActionEvent actionEvent) {
       myLabel.setText(val.myReturn());
    }
}
