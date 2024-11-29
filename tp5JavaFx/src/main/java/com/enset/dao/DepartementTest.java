package com.enset.dao;





import com.enset.entities.Departement;

import java.util.List;

public class DepartementTest {
    public static void main(String[] args) {
        DepartementDaoImpl departementDao = new DepartementDaoImpl();
//
//        List<Departement> departementList = departementDao.findAll();
//        departementList.forEach(departement -> {
//            System.out.println(departement.getId_depart());
//            System.out.println(departement.getNom());
//        });
        Departement departement = new Departement(4, "Electrique et electronique");
        departementDao.save(departement);
    }
}
