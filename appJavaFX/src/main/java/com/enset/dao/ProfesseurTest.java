package com.enset.dao;


import com.enset.entities.Professeur;

import java.util.Date;
import java.util.List;

public class ProfesseurTest {
    public static void main(String[] args) {
        ProfesseurDaoImpl professeurDao = new ProfesseurDaoImpl();
        List<Professeur> professeurList = professeurDao.findByKeyWord("hd");
        professeurList.forEach(professeur -> {
            System.out.println(professeur.getAdresse());
            System.out.println(professeur.getEmail());
        });
        Professeur professeur = professeurDao.findById(1);
        System.out.println(professeur.toString());
//        Professeur professeur1 = new Professeur(2, "Ghzoui", "Amine", "PA12487", "tinghir centre ville", "0643095763","amin01@gmail.com", new Date());
////        professeurDao.save(professeur1);
//        Professeur professeur2 = new Professeur(3, "Kaaib", "Mouad", "HG12413", "agadir taghazoute", "0643093273","mouad01@gmail.com", java.sql.Date.valueOf("2023-10-24"));
//        professeurDao.save(professeur2);
        List<Professeur> professeurs = professeurDao.getAll();
        professeurs.forEach(professeur1 -> {
            System.out.println(professeur1.toString());
        });

    }



}
