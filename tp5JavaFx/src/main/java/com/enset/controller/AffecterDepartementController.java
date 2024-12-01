package com.enset.controller;

import com.enset.dao.DepartementDaoImpl;
import com.enset.dao.ProfesseurDaoImpl;
import com.enset.entities.Departement;
import com.enset.entities.Professeur;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class AffecterDepartementController implements Initializable {
    private DepartementDaoImpl departementDao = new DepartementDaoImpl();
    private ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
    private Professeur professeur;
    private MainViewController mainViewController;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @FXML
    private ComboBox<String> departementsIDAffecter;
   List<Departement> departements = departementDao.findAll();

    @FXML
    void affectDepartementToProf(ActionEvent event) {
       int id_prof = professeur.getId_prof();
        int id_depart = departementsIDAffecter.getSelectionModel().getSelectedItem().charAt(0)-'0';
        professeurDao.affecterADepartement(id_prof, id_depart);
        mainViewController.refresh();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        departements.forEach(departement -> {
            departementsIDAffecter.getItems().add(departement.getId_depart()+" - "+departement.getNom());
        });
    }
    public void setController(MainViewController mainViewController) {
        this.mainViewController = mainViewController;
    }
}
