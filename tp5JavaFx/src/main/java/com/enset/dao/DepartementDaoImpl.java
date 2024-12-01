package com.enset.dao;




import com.enset.entities.Departement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DepartementDaoImpl implements DepartementDao{

    @Override
    public void save(Departement departement) {
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("insert into departement values (?,?)");
            stm.setInt(1,departement.getId_depart());
            stm.setString(2,departement.getNom());
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Departement> findAll() {
        List<Departement> departementList = new ArrayList<>();
        try{
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("select * from departement");
            ResultSet res = stm.executeQuery();
            while (res.next()){
                Departement departement = new Departement(res.getInt("id_depart"), res.getString("nom"));
                departementList.add(departement);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return departementList;

    }

    @Override
    public Departement findById(int id) {
        Departement departement = new Departement();
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("select * from departement where id_depart = ?");
            stm.setInt(1, id);
            ResultSet resultSet = stm.executeQuery();
            while (resultSet.next()){
                Departement departementById = new Departement(resultSet.getInt("id_depart"), resultSet.getString("nom"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return departement;
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("delete from departement where id_depart = ?");
            stm.setInt(1, id);
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Departement departement) {
        try{
            Connection connection = SingletonConnection.getConnection();
            PreparedStatement stm = connection.prepareStatement("update departement set nom=? where id_depart=?");
            stm.setString(1, departement.getNom());
            stm.setInt(2, departement.getId_depart());
            stm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
