package main;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * A class that will start the first stage.
 * */
public class MyApp extends Application {

    /**
     * This method will start the program.*/
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(MyApp.class.getResource("/fxml/mynew.fxml"));
        stage.setTitle("CNC administrations");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }


}
