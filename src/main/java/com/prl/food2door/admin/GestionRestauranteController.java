/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.prl.food2door.admin;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author TI
 */
public class GestionRestauranteController implements Initializable {

    @FXML
    private Button btnVerRestaurantes;
    @FXML
    private ListView<Restaurante> listaRestaurantes;

    private ObservableList<Restaurante> restaurantes;
    @FXML
    private Button btnVerDetalles;
    @FXML
    private Button btnAgregarRestaurante;
    @FXML
    private Button btnAgregarRestaurante1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        restaurantes = FXCollections.observableArrayList();

        LocalTime horaApertura1 = LocalTime.of(9, 0);
        LocalTime horaCerrar1 = LocalTime.of(21, 0);

        LocalTime horaApertura2 = LocalTime.of(21, 0);
        LocalTime horaCerrar2 = LocalTime.of(22, 30);

        LocalTime horaApertura3 = LocalTime.of(10, 30);
        LocalTime horaCerrar3 = LocalTime.of(20, 0);

        List<Comida> productosRest1 = new ArrayList<>();
        Restaurante rest1 = new Restaurante("rest1", horaApertura1, horaCerrar1, 1, productosRest1);
        productosRest1.add(new Comida("comida1", 20.0, 1));
        productosRest1.add(new Comida("comida2", 10.0, 1));
        productosRest1.add(new Comida("comida3", 15.0, 1));

        List<Comida> productosRest2 = new ArrayList<>();
        Restaurante rest2 = new Restaurante("rest2", horaApertura2, horaCerrar2, 2, productosRest2);
        productosRest2.add(new Comida("comida1", 20.0, 2));
        productosRest2.add(new Comida("comida2", 10.0, 2));
        productosRest2.add(new Comida("comida3", 15.0, 2));

        List<Comida> productosRest3 = new ArrayList<>();
        Restaurante rest3 = new Restaurante("rest3", horaApertura3, horaCerrar3, 3, productosRest3);
        productosRest3.add(new Comida("comida1", 20.0, 3));
        productosRest3.add(new Comida("comida2", 10.0, 3));
        productosRest3.add(new Comida("comida3", 15.0, 3));

        restaurantes.addAll(rest1, rest2, rest3);

        listaRestaurantes.setItems(restaurantes);
    }

    @FXML
    private void verRestaurantes(ActionEvent event) {
        if (listaRestaurantes.isVisible()) {
            listaRestaurantes.setVisible(false);
        } else {
            listaRestaurantes.setVisible(true);
        }
    }

    @FXML
    private void verDetallesRestaurante(ActionEvent event) {
        Restaurante restSeleccionado = listaRestaurantes.getSelectionModel().getSelectedItem();
        if (restSeleccionado != null) {
            TableView<Restaurante> tableViewDetalles = new TableView<>();
            TableColumn<Restaurante, String> columnaNombre = new TableColumn<>("Nombre");
            columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            TableColumn<Restaurante, LocalTime> columnaHoraApertura = new TableColumn<>("Hora apertura");
            columnaHoraApertura.setCellValueFactory(new PropertyValueFactory<>("horaApertura"));
            TableColumn<Restaurante, LocalTime> columnaHoraCierre = new TableColumn<>("Hora cierre");
            columnaHoraCierre.setCellValueFactory(new PropertyValueFactory<>("horaCerrar"));
            TableColumn<Restaurante, Integer> columnaImagen = new TableColumn<>("Imagen");
            columnaImagen.setCellValueFactory(new PropertyValueFactory<>("imagen"));
            TableColumn<Restaurante, List<Comida>> columnaProductos = new TableColumn<>("Productos");
            columnaProductos.setCellValueFactory(new PropertyValueFactory<>("productos"));

            tableViewDetalles.getItems().add(restSeleccionado);

            tableViewDetalles.getColumns().addAll(columnaNombre, columnaHoraApertura, columnaHoraCierre, columnaImagen, columnaProductos);

            Stage stage = new Stage();
            stage.setTitle("Detalles del Restaurante");
            Scene scene = new Scene(new Group(tableViewDetalles), 900, 300);
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("null");
            alert.setContentText("Por favor, selecciona un restaurante antes de ver los detalles.");
            alert.showAndWait();

        }
    }

    @FXML
    private void agregarRestaurantes(ActionEvent event) {
        
    }

}
