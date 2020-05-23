package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Machines;
import org.tinylog.Logger;

import java.util.List;


public class NewValueController {
    @FXML
    private TextField addId;

    @FXML
    private TextField addName;

    @FXML
    private TextField addMotor;

    @FXML
    private TextField addToolCount;

    @FXML
    private TextField addWeight;

    @FXML
    private TextField addFloorSpace;

    @FXML
    private Label infoLabel;

    @FXML void initialize()
    {

    }
    public void addNewElement(ActionEvent actionEvent) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(  "gep-mysql");
        EntityManager em = emf.createEntityManager();

        Machines mac = new Machines();

        mac.setId(Integer.parseInt(addId.getText()));
        mac.setMotor(addMotor.getText());
        mac.setFloor_space(addFloorSpace.getText());
        mac.setName(addName.getText());
        mac.setTools_count(Integer.parseInt(addToolCount.getText()));
        mac.setWeight(Integer.parseInt(addWeight.getText()));
        em.getTransaction().begin();
        em.persist(mac);
        em.getTransaction().commit();
        em.close();
        emf.close();
        Logger.trace("Add button was used");
        infoLabel.setText("Added successfully");
    }
}
