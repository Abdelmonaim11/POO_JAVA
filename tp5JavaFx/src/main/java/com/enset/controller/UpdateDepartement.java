package com.enset.controller;

import com.enset.dao.DepartementDaoImpl;
import com.enset.entities.Departement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateDepartement {
    private Departement departement;
    private DepartementDaoImpl departementDao = new DepartementDaoImpl();
    private MainViewController mainViewController;

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
        inputDepartementID.setText(String.valueOf(departement.getId_depart()));
        inputDepartementNom.setText(String.valueOf(departement.getNom()));
    }

    @FXML
    private TextField inputDepartementID;

    @FXML
    private TextField inputDepartementNom;

    @FXML
    void cancelUpdateDepartement(ActionEvent event) {

    }

    @FXML
    void updateDepartement(ActionEvent event) {
        int id = Integer.parseInt(inputDepartementID.getText());
        String nom = inputDepartementNom.getText();
        Departement departement1 = new Departement(id,nom);
        departementDao.update(departement1);
        mainViewController.refresh();
    }
    public void setController(MainViewController mainViewController) {
        this.mainViewController = mainViewController;
    }
}
