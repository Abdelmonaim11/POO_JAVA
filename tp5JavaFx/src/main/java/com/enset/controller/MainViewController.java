package com.enset.controller;

import com.enset.dao.DepartementDaoImpl;
import com.enset.dao.ProfesseurDaoImpl;
import com.enset.entities.Departement;
import com.enset.entities.Professeur;
import com.enset.tp5javafx.HelloApplication;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
    DepartementDaoImpl departementDao = new DepartementDaoImpl();
    @FXML
    private TextField adresseInput;

    @FXML
    private TableColumn<Professeur, String> adrssProf;

    @FXML
    private TextField cinInput;

    @FXML
    private TableColumn<Professeur, String> cinProf;

    @FXML
    private DatePicker dateInput;

    @FXML
    private TableColumn<Professeur, Date> dateProf;

    @FXML
    private TextField emailInput;

    @FXML
    private TableColumn<Professeur, String> emailProf;

    @FXML
    private TextField idInput;

    @FXML
    private TableColumn<Professeur, Integer> idProf;
    @FXML
    private TableColumn<Professeur, Integer> id_depart;

    @FXML
    private TextField nomInput;

    @FXML
    private TableColumn<Professeur, String> nomProf;

    @FXML
    private TextField prenomInput;

    @FXML
    private TableView<Professeur> tableProfs;

    @FXML
    private TableColumn<Professeur, String> prenomProf;

    @FXML
    private TableColumn<Professeur, String> teleProf;
    @FXML
    private Button affectDepartButton;

    @FXML
    private TextField telephonInput;

    @FXML
    private TextField searchProfInput;

    ObservableList<Professeur> profs = FXCollections.observableArrayList(
            professeurDao.getAll()
    );
    ObservableList<Departement> departements = FXCollections.observableArrayList(
            departementDao.findAll()
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idProf.setCellValueFactory(new PropertyValueFactory<>("id_prof"));
        nomProf.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenomProf.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        cinProf.setCellValueFactory(new PropertyValueFactory<>("cin"));
        adrssProf.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        teleProf.setCellValueFactory(new PropertyValueFactory<>("telephon"));
        emailProf.setCellValueFactory(new PropertyValueFactory<>("email"));
        dateProf.setCellValueFactory(new PropertyValueFactory<>("date_recrutement"));
        id_depart.setCellValueFactory(new PropertyValueFactory<>("id_depart"));
        id_depart.setCellFactory(column -> new TableCell<Professeur, Integer>() {
            @Override
            protected void updateItem(Integer item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null || getTableRow().getItem() == null) {
                    setText(null); // Do not show anything for empty rows
                } else if (item == 0) {
                    setText("Aucune Departement");
                } else {
                    setText(String.valueOf(item));
                }
            }
        });
        tableProfs.setItems(profs);
        //Display Departements
        idDepartement.setCellValueFactory(new PropertyValueFactory<>("id_depart"));
        nomDepartement.setCellValueFactory(new PropertyValueFactory<>("nom"));
        departementTable.setItems(departements);
    }
    @FXML
    void searchProf(ActionEvent event) {
         profs.clear();
         String name = searchProfInput.getText();
        List<Professeur> professeursByName = professeurDao.findByKeyWord(name);
        profs.addAll(professeursByName);
    }
    @FXML
    void addProf(MouseEvent event) {
        LocalDate time = dateInput.getValue();
        java.sql.Date sqlDate = java.sql.Date.valueOf(time);
        Professeur professeur = new Professeur(Integer.parseInt(idInput.getText()), nomInput.getText(),prenomInput.getText(), cinInput.getText(), adresseInput.getText(), telephonInput.getText(), emailInput.getText(), sqlDate);
        professeurDao.save(professeur);
        profs.add(professeur);

    }
    @FXML
    void removeProf(MouseEvent event) {
        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
        professeurDao.delete(selectedProf.getId_prof());
        profs.remove(selectedProf);
    }
    @FXML
    void rowClicked(MouseEvent event) {
        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
        idInput.setText(String.valueOf(selectedProf.getId_prof()));
        nomInput.setText(String.valueOf(selectedProf.getNom()));
        prenomInput.setText(String.valueOf(selectedProf.getPrenom()));
        cinInput.setText(String.valueOf(selectedProf.getCin()));
        adresseInput.setText(String.valueOf(selectedProf.getAdresse()));
        telephonInput.setText(String.valueOf(selectedProf.getTelephon()));
        emailInput.setText(String.valueOf(selectedProf.getEmail()));
        java.util.Date date = selectedProf.getDate_recrutement();
        // Use Calendar to extract year, month, and day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create LocalDate
        LocalDate localDate = LocalDate.of(year, month, day);
        dateInput.setValue(localDate);
        System.out.println(selectedProf.getId_depart());
//        idInput.setDisable(true);
        if (selectedProf.getId_depart()!=0){
            affectDepartButton.setDisable(true);
        }else{
            affectDepartButton.setDisable(false);
        }
    }
    @FXML
    void updateProf(ActionEvent event) {


        Professeur selectedProf = tableProfs.getSelectionModel().getSelectedItem();
try{

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("updateProfesseur.fxml"));

    Scene scene = new Scene(fxmlLoader.load());
    UpdateProfesseurController controller = fxmlLoader.getController();

    if (controller != null) {
        controller.setProfesseur(selectedProf);
        controller.setController(this);
    } else {
        System.err.println("Le contrôleur est null !");
    }
    Stage stage = new Stage();
    stage.setTitle("Update Professeur!");
    stage.setScene(scene);
    stage.show();


} catch (IOException e) {
    e.printStackTrace();
}
    }
    @FXML
    private TableView<Departement> departementTable;
    @FXML
    private TableColumn<Departement, Integer> idDepartement;
    @FXML
    private TextField idDepartementInput;
    @FXML
    private TableColumn<Departement, String> nomDepartement;

    @FXML
    private TextField nomDepartementInput;
    @FXML
    void addDepartement(ActionEvent event) {
       Departement departement = new Departement(Integer.parseInt(idDepartementInput.getText()), nomDepartementInput.getText());
       departementDao.save(departement);
       departements.add(departement);
    }
    @FXML
    void removeDepartement(ActionEvent event) {
        Departement selectedDepart = departementTable.getSelectionModel().getSelectedItem();
        departementDao.delete(selectedDepart.getId_depart());
        departements.remove(selectedDepart);
    }

    @FXML
    void updateDepartement(ActionEvent event) {
        Departement selectedDepar = departementTable.getSelectionModel().getSelectedItem();
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("updateDepartement.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            UpdateDepartement controller = fxmlLoader.getController();

            if (controller != null) {
                controller.setDepartement(selectedDepar);
                controller.setController(this);
            } else {
                System.err.println("Le contrôleur est null !");
            }
            Stage stage = new Stage();
            stage.setTitle("Update Departement!");
            stage.setScene(scene);
            stage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void rowDepartementClicked(MouseEvent event) {

    }
    @FXML
    void affecterDepartement(ActionEvent event) {
        Professeur selectedP = tableProfs.getSelectionModel().getSelectedItem();
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("affecterDepartement.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            AffecterDepartementController controller = fxmlLoader.getController();

            if (controller != null) {
                controller.setProfesseur(selectedP);
                controller.setController(this);
            } else {
                System.err.println("Le contrôleur est null !");
            }
            Stage stage = new Stage();
            stage.setTitle("Affecter Departement!");
            stage.setScene(scene);
            stage.show();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refresh() {
        profs = FXCollections.observableArrayList(
                professeurDao.getAll()
        );
        tableProfs.setItems(profs);
        departements = FXCollections.observableArrayList(
                departementDao.findAll());
        departementTable.setItems(departements);
    }

}
