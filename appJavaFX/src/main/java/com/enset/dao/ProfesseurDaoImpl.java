package com.enset.dao;

import com.enset.entities.Departement;
import com.enset.entities.Professeur;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfesseurDaoImpl implements ProfesseurDao{
    @Override
    public List<Professeur> getAll() {
        List<Professeur> professeurList = new ArrayList<>();
        try{
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("select * from professeur");
            ResultSet res = stm.executeQuery();
            while (res.next()){
                Professeur professeur = new Professeur(res.getInt("id_prof"),
                        res.getString("nom"),
                        res.getString("prenom"),
                        res.getString("cin"),
                        res.getString("adresse"),
                        res.getString("telephon"),
                        res.getString("email"),
                        res.getDate("date_recrutement")
                        );
                professeurList.add(professeur);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return professeurList;
    }

    @Override
    public List<Professeur> findByKeyWord(String keyword) {
        List<Professeur> professeurList = new ArrayList<>();
        try{
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("select * from professeur where nom like ?");
            stm.setString(1,"%"+keyword+"%");
            ResultSet res = stm.executeQuery();
            while (res.next()){
                Professeur professeur = new Professeur(res.getInt("id_prof"),
                        res.getString("nom"),
                        res.getString("prenom"),
                        res.getString("cin"),
                        res.getString("adresse"),
                        res.getString("telephon"),
                        res.getString("email"),
                        res.getDate("date_recrutement")
                );
                professeurList.add(professeur);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return professeurList;
    }

    @Override
    public Professeur findById(int id) {
        Professeur professeur=null;
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("select * from professeur where id_prof= ?");
            stm.setInt(1,id);
            ResultSet resultSet = stm.executeQuery();

            while (resultSet.next()){
                 professeur = new Professeur(resultSet.getInt("id_prof"), resultSet.getString("nom"),
                        resultSet.getString("prenom"),
                         resultSet.getString("cin"),
                        resultSet.getString("adresse"),

                        resultSet.getString("telephon"),
                        resultSet.getString("email"),
                        resultSet.getDate("date_recrutement")
                        );
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return professeur;
    }

    @Override
    public void save(Professeur professeur) {
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("insert into professeur(id_prof,nom,prenom,cin,adresse,telephon,email,date_recrutement) values (?,?,?,?,?,?,?,?)");
            stm.setInt(1,professeur.getId_prof());
            stm.setString(2,professeur.getNom());
            stm.setString(3,professeur.getPrenom());
            stm.setString(4,professeur.getCin());
            stm.setString(5,professeur.getAdresse());
            stm.setString(6,professeur.getTelephon());
            stm.setString(7,professeur.getEmail());
            stm.setDate(8, new java.sql.Date(professeur.getDate_recrutement().getTime()));
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("delete from professeur where id_prof = ?");
            stm.setInt(1,id);
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Professeur professeur) {
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("UPDATE professeur SET nom = ?,prenom = ?,cin=?,adresse=?, telephon=?, email=?, date_recrutement = ? WHERE id_prof = ?");
            stm.setString(1,professeur.getNom());
            stm.setString(2,professeur.getPrenom());
            stm.setString(3,professeur.getCin());
            stm.setString(4,professeur.getAdresse());
            stm.setString(5,professeur.getTelephon());
            stm.setString(6,professeur.getEmail());
            stm.setDate(7, new java.sql.Date(professeur.getDate_recrutement().getTime()));
            stm.setInt(8, professeur.getId_prof());
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void affecterADepartement(int id_prof, int id_depart) {
       try {
           Connection connection = SingletonConnection.getConnection();
           PreparedStatement stm = connection.prepareStatement("UPDATE professeur SET id_depart = ? WHERE id_prof = ?");
           stm.setInt(1,id_depart);
           stm.setInt(2,id_prof);
           stm.executeUpdate();
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
