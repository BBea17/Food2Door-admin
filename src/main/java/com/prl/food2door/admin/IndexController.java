/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.prl.food2door.admin;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TI
 */
public class IndexController implements Initializable {

    @FXML
    private Button btnIdentificate;
    @FXML
    private Button btnRegistrate;
    @FXML
    private TextField usrField;
    @FXML
    private PasswordField pswField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void identificateClicked(ActionEvent event) {
        String user = usrField.getText();
        String pswd = pswField.getText();
        if(user.equals("admin") && pswd.equals("admin")){
            
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.close();
            
            try{
                Parent root = FXMLLoader.load(getClass().getResource("a.fxml"));
                Stage newStage = new Stage();
                newStage.setScene(new Scene(root));
                newStage.show();
            }catch(IOException e){
                e.printStackTrace();
            }
        }else{
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Las credenciales no son correctas.");
            alert.setContentText("Asegúrate de escribir correctamente las credenciales de inicio de sesión.");
            alert.showAndWait();
        }
    }

    @FXML
    private void registrateClicked(ActionEvent event) {
    }
    
}
