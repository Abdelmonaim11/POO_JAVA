package com.enset.entities;

import java.io.Serializable;
import java.util.Date;

public class Professeur implements Serializable {
    private int id_prof;
    private String nom, prenom, cin, adresse,telephon,email;
    private Date date_recrutement;
    private Departement departement;

    public Professeur(int id_prof, String nom, String prenom, String cin, String adresse, String telephon, String email, Date date_recrutement) {
        this.id_prof = id_prof;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.telephon = telephon;
        this.email = email;
        this.date_recrutement = date_recrutement;
    }

    public Professeur() {
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephon() {
        return telephon;
    }

    public void setTelephon(String telephon) {
        this.telephon = telephon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_recrutement() {
        return date_recrutement;
    }

    public void setDate_recrutement(Date date_recrutement) {
        this.date_recrutement = date_recrutement;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "id_prof=" + id_prof +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cin='" + cin + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephon='" + telephon + '\'' +
                ", email='" + email + '\'' +
                ", date_recrutement=" + date_recrutement +
                '}';
    }
}
