/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Stian
 */
public class CustomerController implements Initializable {

    private Windows windows;
    @FXML private Button payments;
    
    

    @FXML
    private void test(ActionEvent e) {
        Label label;
        FlowPane pane1;
        Scene scene1;
        Stage theStage;
        Stage newStage = new Stage();
        if (e.getSource() == payments) {
            pane1 = new FlowPane();
            pane1.getChildren().add(new Label("TeSt"));
            theStage = (Stage) payments.getScene().getWindow();
            newStage.setScene(new Scene(pane1, 200, 100));
            newStage.initModality(Modality.APPLICATION_MODAL);
            newStage.setTitle("New Stage");
            newStage.showAndWait();
        } else 
            newStage.close();
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
