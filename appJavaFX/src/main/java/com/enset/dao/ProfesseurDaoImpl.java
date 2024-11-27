package com.enset.dao;

import com.enset.entities.Departement;
import com.enset.entities.Professeur;

import java.sql.Connection;
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
        return null;
    }

    @Override
    public void save(Professeur professeur) {

    }

    @Override
    public Professeur delete(int id) {
        return null;
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void affecterADepartement(int id_prof, int id_depart) {

    }
}
