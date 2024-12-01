package com.enset.controller;

import com.enset.dao.ProfesseurDaoImpl;
import com.enset.entities.Professeur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.ResourceBundle;

public class UpdateProfesseurController  {
    private ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
    private Professeur professeur;
    private MainViewController mainViewController;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
                idProfUpdate.setText(String.valueOf(professeur.getId_prof()));
        nomProfUpdate.setText(String.valueOf(professeur.getNom()));
        prenomProfUpdate.setText(String.valueOf(professeur.getPrenom()));
        cinProfUpdate.setText(String.valueOf(professeur.getCin()));
        adresseProfUpdate.setText(String.valueOf(professeur.getAdresse()));
        telephonProfUpdate.setText(String.valueOf(professeur.getTelephon()));
        emailProfUpdate.setText(String.valueOf(professeur.getEmail()));
        java.util.Date date = professeur.getDate_recrutement();
        // Use Calendar to extract year, month, and day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Create LocalDate
        LocalDate localDate = LocalDate.of(year, month, day);
        dateProfUpdate.setValue(localDate);
    }

    @FXML
    private TextArea adresseProfUpdate;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField cinProfUpdate;

    @FXML
    private DatePicker dateProfUpdate;

    @FXML
    private TextField emailProfUpdate;

    @FXML
    private TextField idProfUpdate;

    @FXML
    private TextField nomProfUpdate;

    @FXML
    private TextField prenomProfUpdate;

    @FXML
    private TextField telephonProfUpdate;

    @FXML
    void cancelUpdateProfesseur(ActionEvent event) {

    }

    @FXML
    void updateProfesseur(ActionEvent event) {

        int id = Integer.parseInt(idProfUpdate.getText());
        String nom = nomProfUpdate.getText();
        String prenom = prenomProfUpdate.getText();
        String cin = cinProfUpdate.getText();
        String adresse = adresseProfUpdate.getText();
        String telephon = telephonProfUpdate.getText();
        String email = emailProfUpdate.getText();
        LocalDate localDate = dateProfUpdate.getValue();
        java.util.Date dateRecrutement = java.sql.Date.valueOf(localDate);
        Professeur updatedProf = new Professeur(id, nom, prenom, cin, adresse, telephon, email, dateRecrutement);
        professeurDao.update(updatedProf);
        mainViewController.refresh();
    }

    public void setController(MainViewController mainViewController) {
        this.mainViewController = mainViewController;
    }
}
